<html>
    <head>
        <title>
            Bank Management
        </title>
    </head>
    <body>
        <?php
            $balance = "";
            $amt = "";
            $uname=$_GET["uname"];
            if($_SERVER["REQUEST_METHOD"] == "POST"){
                
                $user = "root";
                $pass = "";
                $server = "localhost";
                $db = "Base1";
                $uname = $_POST["userName"];
                $amt = $_POST["amount"];
                $action = $_POST["action"];
                
                if(empty($_POST["userName"])){
                    die("Account Number is required");
                }
                else{
                    $conn = new mysqli($server,$user,$pass,$db);
                    if($conn->connect_error){
                        die("Not connected to Database");
                    }
                    $sql = "SELECT balance from Login where userName = '$uname';";
                    $result = $conn->query($sql);
                    if($result->num_rows > 0){
                        while($row = $result->fetch_assoc()){
                            $balance = $row["balance"];
                        }
                    }
                    else{
                        die("Invalid Account Number");
                    }
                    if($action == "deposit"){
                        if(empty($_POST["amount"])){
                            die("Amount required");
                        }
                        $balance = $balance + $amt;
                        $sql1 = "update Login set balance = ".$balance." where userName = '$uname';";
                        $conn->query($sql1);
                    }
                    elseif($action == "withdraw"){
                        if(empty($_POST["amount"])){
                            die("Amount required");
                        }
                        if($balance < $amt || $balance - $amt < 1000){
                            die("This operation cannot be performed due to insufficient balance.");
                        }
                        $balance = $balance - $amt;
                        $sql1 = "update Login set balance = ".$balance." where userName = '$uname';";
                        $conn->query($sql1);
                    }
                    else{
                        echo "<table border=1.0><tr><th>Account Number</th><th>Balance</th></tr>";
                        echo "<tr><td>".$uname."</td><td>".$balance."</td></tr></table>";
                    }
                }   
            }
        ?>
        <form action="<?php htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post">
            AccNo <input type="text" value="<?php echo $uname;?> " name="userName" /><br><br>
            Amount <input type = "text" value="<?php echo $amt?> " name="amount" /><br><br>
            Transaction<br>
            <input type="radio" value="withdraw" name="action" />Withdraw<br>
            <input type="radio" value="deposit" name="action" />Deposit<br>
            <input type="radio" value="checkBalance" name="action" />Check Balance<br>
            <input type="submit" value="submit" />
        </form>
    </body>
</html>