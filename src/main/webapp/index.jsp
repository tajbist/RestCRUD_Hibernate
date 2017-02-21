<html>
<body>
<div style="text-align: center">
    <h2>Jersey RESTful Web Application!</h2>
    <p><a href="webapi/customers">Rest Resources : XML All Customer</a>
    <p><a href="http://www.developernepal.com">DeveloperZone</a>

</div>
<div style="text-align: center">
    <h2>Rest Resources : XML Add Customer</h2>
    <form action="webapi/customer/add" method="POST">
        <div style="text-align: center">

            <div style="padding:10px;">
                Customer Name: <input name="cname"/>
            </div>
            <div style="padding:10px;">
                Customer Email: <input name="email"/>
            </div>
            <div style="padding:10px;">
                Customer Phone: <input name="phone"/>
            </div>
            <div style="padding:10px;text-align:center">
                <input type="submit" value="Submit"/>
            </div>
        </div>
    </form>
</div>
</body>
</html>
