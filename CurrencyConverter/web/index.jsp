<%-- 
    Document   : index
    Created on : May 24, 2023, 11:00:31 AM
    Author     : Active
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="java.sql.*,java.util.*"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Currency Converter</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js">
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js">
        </script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js">
        </script>

        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Amiri&family=Lobster&family=Pacifico&display=swap"
              rel="stylesheet">
        <!-- linking style.css file-->
        <link href="Style.css" rel="stylesheet" type="text/css"/>
    </head>
    
    <form method="post" action="MyConveter">
            <h1 class="heading text-center display-2">
                Currency Converter
            </h1>
            <hr>

            <div class="container">
                <div class="main">
                    <div class="form-group">
                        <label for="oamount">
                            Amount to Convert :
                        </label>
                        <input type="text" class="form-control searchBox" placeholder="0.00" name="getamt">
                    </div>
                    <div class="row">
                        <div class="col-sm-6">
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">From</span>
                                </div>
                                <select class="form-control from" name="first_country">
                                    <option value="">Select One …</option>
                                    <option value="USA">USA</option>
                                    <option value="Nigeria">Nigeria</option>
                                    <option value="Brazil">Brazil</option>
                                    <option value="Canada">Canada</option>
                                    <option value="Kenyan">Kenyan</option>
                                    <option value="Indonesia">Indonesia</option>
                                    <option value="India">India</option>
                                    <option value="Philippine">Philippine</option>
                                    <option value="Pakistan">Pakistan</option>
                                </select>

                            </div>
                        </div>

                        <div class="col-sm-6">
                            <div class="input-group mb-3">
                                <div class="input-group-prepend">
                                    <span class="input-group-text">To</span>
                                </div>
                                <select class="form-control to" name="second_country">
                                    <option value="">Select One …</option>
                                    <option value="USA">USA</option>
                                    <option value="Nigeria">Nigeria</option>
                                    <option value="Brazil">Brazil</option>
                                    <option value="Canada">Canada</option>
                                    <option value="Kenyan">Kenyan</option>
                                    <option value="Indonesia">Indonesia</option>
                                    <option value="India">India</option>
                                    <option value="Philippine">Philippine</option>
                                    <option value="Pakistan">Pakistan</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div name="finalAmount" class="text-center">

                        <!-- Display the converted amount -->
                        <h2>Converted Amount : 
                            <lable class="finalValue" style="color:white;" id="setamt" >
                                <%=request.getParameter("val")%>
                                </label>
                        </h2>
                    </div>
                    <div class="text-center">

                        <!-- convert button -->


                        <input type="submit" class="btn btn-primary convert m-2" value="Convert">


                        <!-- reset button -->

                        <input type="reset" class="btn btn-primary m-2" value="Reset">

                    </div>

                </div>
        </form> 


    </div>


</html>
