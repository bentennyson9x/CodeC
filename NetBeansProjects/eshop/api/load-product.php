<?php

require_once './connection.php';

// Nếu kết nối thành công
if ($isOK) {
    $sql = "SELECT * FROM `product`";    
    $result = mysqli_query($connect, $sql);

    // Đọc về dữ liệu    
    // Trả về JSON
    $rows = array();
    while ($row = mysqli_fetch_assoc($result)) {
        $rows[] = $row;
    }
//    if(!empty($rows)){
        echo json_encode($rows);
//    } else {
//        echo json_encode($mess_empty);
//    }  
}
