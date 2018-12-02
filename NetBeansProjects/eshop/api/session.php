<!DOCTYPE html>
<!--
Create by Minh Vũ FC 8.2016
-->
<?php
session_start();
?>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Demo Session</title>
    </head>
    <body>
        <b>Hệ thống đào tạo lập trình viên quốc tế Bachkhoa-Aptech</b>
        <?php
        if (isset($_SESSION['counter'])) {
            $_SESSION['counter'] += 1;
            echo "Bạn đã truy cập trang " . $_SESSION['counter'] . " lần";
        } else {
            $_SESSION['counter'] = 1;
            echo "Session đã không được tạo";
        }
        ?>
    </body>
</html>
