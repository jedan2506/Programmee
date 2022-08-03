<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="design.css">
    <link rel="icon" type="image/x-icon" href="icons/favicon.ico">
    <link rel="stylesheet" href="style.css">
    <title>Simplifire | Display</title>
    <style>
        .inputfield{
            border-radius: 12px;
            border:none;
            font-size: 12px; 
            font-weight: bold; 
            padding: 12px 45px; 
            transition: transform 80ms ease-in;
            box-shadow: 0 12px 16px 0 rgba(0, 0, 0, 0.077), 0 17px 50px 0 rgba(0, 0, 0, 0.071);
            width: 242px; 
            text-align: center;
            background-color:#000000;
            color:white;
        }
        #tables{
            width: 160px;
        }

    </style>
</head>

<body>
<?php include 'header.php' ?>
    <br><br>
        <form action="show.php" method="post">  
            
            <center>
            <input type="text" name="valueToSearch" placeholder="Organised By" class="inputfield">
            <input type="Date" name="start" placeholder="Start" class="inputfield">
            <input type="Date" name="end" placeholder="End" class="inputfield">
            <input type="text" name="valueToSearch2" placeholder="Type" class="inputfield">
            <br><br>  <label for="tables">Choose a Document:</label>
            <select class="inputfield" id="tables" name="table">
                        <?php
                            include('connect.php');
                            $quer="show tables";
                            $result = mysqli_query($con,$quer);
                            while($table = mysqli_fetch_array($result))
                            { ?>
                                 <option value="<?php echo($table[0])??''; ?>"><?php echo($table[0])??''; ?></option>
                           <?php }

                        ?>
                    </select>
            <input type="submit" name="search" value="Search" class="button1"><br><br>
            
            <table cellspacing="0px" cellpadding="13px">
                <tr>
                    <th  style="width: 320px;"class="datalooks">Organized By</th>
                    <th  style="width: 320px;" class="datalooks">Name</th>
                    <th  style="width: 200px;" class="datalooks">Start Date</th>
                    <th  style="width: 200px;" class="datalooks">End Date</th>
                    <th  style="width: 320px;"class="datalooks">Role</th>
                    <th  style="width: 320px;" class="datalooks">Institute</th>
                    <th  style="width: 180px;" class="datalooks">Duration</th>
                    <th  style="width: 110px;" class="datalooks">URL</th>
                    <th  style="width: 320px;"class="datalooks">Type</th>
                    <th  style="width: 320px;" class="datalooks">Level</th>
                    <th  style="width: 180px;" class="datalooks">Proof</th>
                </tr>

                <?php

                if(isset($_POST['search']))
                {
                    
                    $table = $_POST['table'];
                    $valueToSearch = $_POST['valueToSearch'];
                    $valueToSearch1 = $_POST['start'];
                    $valueToSearch2 = $_POST['valueToSearch2'];
                    $valueToSearch3 = $_POST['end'];
                    if(($valueToSearch=="")AND($valueToSearch1=="")AND($valueToSearch2=="")AND($valueToSearch3==""))
                    {
                        $query = "SELECT * FROM $table";
                        $search_result = filterTable($query);
                    }
                    elseif(($valueToSearch=="")AND($valueToSearch1=="")AND($valueToSearch3==""))
                    {
                        $query = "SELECT * FROM $table WHERE type= '$valueToSearch2'";
                        $search_result = filterTable($query);
                    }
                    elseif(($valueToSearch1=="")AND($valueToSearch2=="")AND($valueToSearch3==""))
                    {
                        $query = "SELECT * FROM $table WHERE organized= '$valueToSearch'";
                        $search_result = filterTable($query);
                    }
                    elseif(($valueToSearch=="")AND($valueToSearch2=="")AND($valueToSearch3==""))
                    {
                        $query = "SELECT * FROM $table WHERE start ='$valueToSearch1'";
                        $search_result = filterTable($query);
                    }
                    elseif(($valueToSearch=="")AND($valueToSearch2==""))
                    {
                        $query = "SELECT * FROM $table WHERE start >='$valueToSearch1' AND start <='$valueToSearch3'";
                        $search_result = filterTable($query);
                    }
                    elseif(($valueToSearch3=="")AND($valueToSearch2==""))
                    {
                        $query = "SELECT * FROM $table WHERE organized= '$valueToSearch' AND start ='$valueToSearch1'";
                        $search_result = filterTable($query);
                    }
                    elseif($valueToSearch2=="")
                    {
                        $query = "SELECT * FROM $table WHERE organized= '$valueToSearch' AND start >='$valueToSearch1' AND start <='$valueToSearch3'";
                        $search_result = filterTable($query);
                    }
                    elseif(($valueToSearch=="")AND($valueToSearch3==""))
                    {
                        $query = "SELECT * FROM $table WHERE type= '$valueToSearch2' AND start ='$valueToSearch1'";
                        $search_result = filterTable($query);
                    }
                    elseif($valueToSearch=="")
                    {
                        $query = "SELECT * FROM $table WHERE type= '$valueToSearch2' AND start >='$valueToSearch1' AND start <='$valueToSearch3'";
                        $search_result = filterTable($query);
                    }
                    elseif($valueToSearch1=="")
                    {
                        $query = "SELECT * FROM $table WHERE organized= '$valueToSearch' AND type= '$valueToSearch2'";
                        $search_result = filterTable($query);
                    }
                    else
                    {
                        $query = "SELECT * FROM $table WHERE organized= '$valueToSearch' AND type= '$valueToSearch2' AND start >='$valueToSearch1' AND start <='$valueToSearch3'";
                        $search_result = filterTable($query);
                    }

                }

                function filterTable($query)
                {
                    include('connect.php');
                    $filter_Result = mysqli_query($con, $query);
                    return $filter_Result;
                }
                ?>
      <!-- populate table from mysql database -->
                <?php while($row = mysqli_fetch_array($search_result)):?>
                <tr class="datalooks">
                    <td><?php echo $row['organized']??''; ?></td>
                    <td><?php echo $row['name']??''; ?></td>
                    <td><?php echo $row['start']??''; ?></td>
                    <td><?php echo $row['end']??''; ?></td>
                    <td><?php echo $row['role']??''; ?></td>
                    <td><?php echo $row['institute']??''; ?></td>
                    <td><?php echo $row['duration']??''; ?></td>
                    <td><?php echo $row['url']??''; ?></td>
                    <td><?php echo $row['type']??''; ?></td>
                    <td><?php echo $row['level']??''; ?></td>
                    <td><?php echo $row['proof']??''; ?></td>
                </tr>
                <?php endwhile;?>
            </table></center>
        </form>
        <br><br><input type="button" value="Back" id="back" onclick="history.back()" class="button2">
        <form method="post" action="export.php" align="center">
            <input type="submit" name="export" value="CSV Export" class="button1" />
            <input type="hidden" name="hidden1" value=<?php echo $table??'';?>" />  
        </form> 
    </body>
    </html>

