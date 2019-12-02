<html>
    <head>
        <title>
            Bank Management
        </title>
    </head>
    <body>
        <?php
            $uname = "";
            $pwd = "";
            if($_SERVER["REQUEST_METHOD"] == "POST"){
                
                $user = "root";
                $pass = "";
                $server = "localhost";
                $db = "Base1";
                $uname = $_POST["userName"];
                $pwd = $_POST["passWord"];
                if(empty($_POST["userName"])){
                    die("Account Number is required");
                }
                else{
                    $conn = new mysqli($server,$user,$pass,$db);
                    if($conn->connect_error){
                        die("Not connected to Database");
                    }
                    $sql = "SELECT userName,passWord from Login where userName = '$uname' and passWord = '$pwd';";
                    $result = $conn->query($sql);
                    if($result->num_rows > 0){
                        header('Location:prog7.php?uname='.$uname);                        
                    }
                    else{
                        die("Invalid Account Number");
                    }
                    
                }   
            }
        ?>
        <form action="<?php htmlspecialchars($_SERVER["PHP_SELF"]);?>" method="post">
            UserName<input type="text" value="<?php echo $uname;?> " name="userName" /><br><br>
            Password<input type = "text" value="<?php echo $pwd?> " name="passWord" /><br><br>
            <input type="submit" value="submit" />
        </form>
    </body>
</html>