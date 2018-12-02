<?php

/*
 * Exam: 
 * http://localhost:81/bkap-demo-login/insert.php?username=minhvt&password=123456&fullname=Vutuanminh&gender=1&email=minh@yahoo.com
 */

require_once './connection.php';

// Nếu kết nối thành công
if ($isOK && isset($_REQUEST['username'])) {
    $param1_id = filter_input(INPUT_GET, 'id', FILTER_SANITIZE_STRING);
    $param2 = $_REQUEST['username'];
    $param3 = $_REQUEST['password'];
    $param4 = $_REQUEST['fullname'];
    $param5 = $_REQUEST['gender'];
    $param6 = $_REQUEST['email'];

//echo "id = ".$param1_id."</br>";
//echo "lastname = ".$param2_lastname."</br>";
//echo "firstName = ".$param3_firstName."</br>";
//echo "email = ".$param4_email."</br>";
//echo "officeCode = ".$param5_officeCode."</br>";
//echo "jobTitle = ".$param6_jobTitle."</br>";

    $sql = "INSERT INTO `tbluser`
(`username`, `password`, `fullname`, `gender`, `email`) VALUES 
('" . $param2 . "','" . $param3 . "','" . $param4 . "'," . $param5 . ",'" . $param6 . "')";
// echo $sql;
    $query = mysqli_query($connect, $sql);

// Nếu thực thi thành công trả về thông báo
    if ($query) {
        // echo "Thêm dữ liệu thành công";
        echo json_encode($mess_success);
    } else {
//    echo $sql."</br>";
//    echo "Thất bại";
        echo json_encode($mess_failure);
    }
}
