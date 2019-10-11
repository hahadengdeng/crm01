<%@ page import="java.util.List" %>
<%@ page import="crm.entity.Permission" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <style>
        .error {
            color: red;
        }
    </style>

</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="navbar" style="margin-bottom: 5px;">
                <center><font size="5px">欢迎使用*********系统</font></center>
                <button id="loginout" type="button" class="btn btn-default" aria-label="Left Align"
                        style="margin-left: 95%;">
                    <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
                </button>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-2">
            <div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
                <c:forEach items="${list}" var="p" varStatus="v">
                    <shiro:hasPermission name="${p.pname}">
                        <div class="panel panel-default">
                            <div class="panel-heading" role="tab" id="heading${v.index}">
                                <h4 class="panel-title">
                                    <a role="button" data-toggle="collapse" data-parent="#accordion"
                                       href="#collapse${v.index}" aria-expanded="true"
                                       aria-controls="collapse${v.index}">
                                            ${p.pinfo}
                                    </a>
                                </h4>
                            </div>
                            <div id="collapse${v.index}" class="panel-collapse collapse in" role="tabpanel"
                                 aria-labelledby="heading${v.index}">
                                <div class="panel-body">
                                    <c:if test="${p.list!=null}">
                                        <c:forEach items="${p.list}" var="m">
                                            <shiro:hasPermission name="${m.pname}">
                                                <c:choose>
                                                    <c:when test="${m.purl eq 'findCusByCom.action'}">
                                                        <a class=" btn btn-block btn-primary"
                                                           href="${pageContext.request.contextPath}/${m.purl}?username=<shiro:principal/>"
                                                           target="action">${m.pinfo}</a>
                                                    </c:when>
                                                    <c:when test="${m.purl eq 'findAllByCom.action'}">
                                                        <a class=" btn btn-block btn-primary"
                                                           href="${pageContext.request.contextPath}/${m.purl}?username=<shiro:principal/>"
                                                           target="action">${m.pinfo}</a>
                                                    </c:when>
                                                    <c:otherwise>
                                                        <a class=" btn btn-block btn-primary"
                                                           href="${pageContext.request.contextPath}/${m.purl}"
                                                           target="action">${m.pinfo}</a>
                                                    </c:otherwise>
                                                </c:choose>
                                            </shiro:hasPermission>
                                        </c:forEach>
                                    </c:if>
                                </div>
                            </div>
                        </div>
                    </shiro:hasPermission>
                </c:forEach>
                <div class="panel panel-default">
                    <div class="panel-heading" role="tab" id="headingTwo">
                        <h4 class="panel-title">
                            <a class="collapsed" role="button" data-toggle="collapse" data-parent="#accordion"
                               href="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
                                系统管理
                            </a>
                        </h4>
                    </div>
                    <div id="collapseTwo" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                        <div class="panel-body">
                            <button type="button" class="btn btn-block btn-primary" data-toggle="modal"
                                    data-target="#myModal">
                                修改密码
                            </button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-md-10" style="padding: 0;">
            <iframe src="${pageContext.request.contextPath}/welcome.jsp" width="1278px" height="650px" name="action">
            </iframe>
        </div>
    </div>
</div>


<%--	<button type="button" class="btn btn-block btn-primary" data-toggle="modal" data-target="#myModal">
        修改密码
    </button>--%>
<%--修改密码的模态框--%>
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">

            <form id="form" method="post" action="${pageContext.request.contextPath}/modifyPassword.action">
                <div>
                    <p>请在此处修改你的密码:</p>
                    <input type="text" value="<shiro:principal/>" hidden id="username" name="username"/>
                </div>
                <div class="form-group">
                    <label for="oldPassword">请输入原来的密码:</label>
                    <input type="password" class="form-control" id="oldPassword" placeholder="OldPassword"
                           name="oldPassword">
                </div>
                <div class="form-group">
                    <label for="password">请输入您要修改的密码:</label>
                    <input type="password" class="form-control" id="password" placeholder="Password" name="password">
                </div>
                <div class="form-group">
                    <label for="newPassword">请再次确认您要修改的密码:</label>
                    <input type="password" class="form-control" id="newPassword" placeholder="NewPassword"
                           name="newPassword">
                </div>
            </form>

            <div class="modal-footer">
                <button type="button" class="btn btn-primary" id="primary">确认修改</button>
            </div>
        </div>
    </div>
</div>
<%---------------------------%>
</body>
<script src="javascript/jQuery-1.12.4.js"></script>
<script src="javascript/bootstrap.js"></script>
<script src="${pageContext.request.contextPath}/javascript/jquery.validate.js"></script>
<script src="${pageContext.request.contextPath}/javascript/messages_zh.js"></script>
<script>
    $("#loginout").click(function () {
        window.location.href = "${pageContext.request.contextPath}/loginOut.action";
    })

    $("#primary").click(function () {
        $("#form").submit();
    })

    $.validator.setDefaults({
        submitHandler: function (form) {
            form.submit();
        }
    });


    $().ready(function () {
        $("#form").validate({
            rules: {
                oldPassword: {
                    required: true,
                    remote: {
                        url: "${pageContext.request.contextPath}/checkPassword.action",
                        type: "post",
                        data: {
                            username: function () {
                                return $("#username").val();
                            },
                            password: function () {
                                return $("#oldPassword").val();
                            }
                        }
                    }
                },
                password: "required",
                newPassword: {
                    required: true,
                    equalTo: "#password"
                },
            },
            messages: {
                oldPassword: {
                    required: "请输入原密码",
                    remote: "与原密码不符"
                },
                password: {
                    required: "请输入密码",
                },
                password2: {
                    required: "请输入密码",
                    equalTo: "两次密码输入不一致"
                }
            },
        });
    });
</script>
</html>
