<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>主页 - 酒店预定系统</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="bootstrap/css/bootstrap-datetimepicker.min.css"/>
    <link rel="stylesheet" href="css/index.css"/>
<body>

<%@include file="header.jsp"%>

<div class="container">
    <div class="col-xs-8">
        <div id="book_room">
            <h3>预订房间<span class="glyphicon glyphicon-circle-arrow-right"></span></h3>

            <form class="form-horizontal" id="book_form">
                <div class="form-group">
                    <label class="control-label col-xs-2">房间类型</label>

                    <div class="col-xs-7">
                        <select class="form-control" id="book_type"></select>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-xs-2">预订日期</label>

                    <div class="col-xs-7">
                        <input class="form-control" name="" type="text" id="book_date" autocomplete="off" readonly>
                        <label for="book_date">
                            <span class="glyphicon glyphicon-calendar choose_date_icon"></span>
                        </label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-xs-offset-2 col-xs-10">
                        <button class="btn btn-primary" id="go_book_page" type="button">预订房间</button>
                    </div>
                </div>

            </form>
        </div>

        <div id="hotel_pictures">
            <h3>酒店房间实拍图<span class="glyphicon glyphicon-picture"></span></h3>

            <div class="box">
                <ul class="list-inline" id="hotel_pictures_list">
                    <li><a href="book.jsp"><img class="img-thumbnail" src="img/p1.jpeg"></a></li>
                    <li><a href="book.jsp"><img class="img-thumbnail" src="img/p2.jpg"></a></li>
                    <li><a href="book.jsp"><img class="img-thumbnail" src="img/p3.jpg"></a></li>
                    <li><a href="book.jsp"><img class="img-thumbnail" src="img/p4.jpg"></a></li>
                    <li><a href="book.jsp"><img class="img-thumbnail" src="img/p5.png"></a></li>
                    <li><a href="book.jsp"><img class="img-thumbnail" src="img/p6.jpg"></a></li>  
                </ul>
            </div>
        </div>
    </div>

    <div class="col-xs-4">
        <div id="book_info">
            <img src="img/logo.jpg" width="300px" height="200px">
            <h3>酒店简介</h3>
			<P>7天连锁酒店集团（7 Days Group Holdings Limited），自2005年成立以来，经过快速发展，分店总数已经超过2000家，覆盖全国300座城市，成为中国经济型酒店行业的第一品牌。 
2014年，7天品牌家族正式增加的两位新成员：7天优品和7天阳光。现7天品牌拥有：①定位于商务时尚的高端经济型酒店产品“7天优品”，②定位为都市时尚的经济型酒店产品“7天阳光”，③以方便快捷倍受消费者欢迎的“7天酒店”。三大酒店产品共同诠释“年轻的选择”这一核心价值主张。</P>
        </div>
    </div>
</div>

<script src="bootstrap/js/bootstrap-datetimepicker.min.js"></script>
<script src="bootstrap/js/bootstrap-datetimepicker.zh-CN.js"></script>
<script src="js/index.js"></script>
</body>
</head>
</html>