package day10_NestedIf;

public class HTTP {
    public static void main(String[] args) {

        int n=500;
        String status=(n==200||n==201||n==202||n==301||n==303||
                n==304||n==307||n==400||n==401||n==403||n==404||n==410||n==500||n==503)? (n==200)? "OK"
                :(n==201)?"Created":(n==202)?"Accepted":(n==301)? "Moved Permanently":(n==303)?"See Other"
                :(n==304)?"Not Modified":(n==307)?"Temporary Redirect":(n==400)?"Bad Request":(n==401)?"Unauthorized"
                :(n==403)?"Forbidden":(n==404)?"Not Found":(n==410)?"Gone":(n==500)?"Internal Server Error"
                :"Service Unavailable":"Invalid number";

        System.out.println(status);



    }
}
/*
7.  HTTP is the protocol that governs communications between web-servers and web clients.
 Part of the protocol includes a status code returned by the server to tell
 the browser the status of its most recent page request.
    Some of the codes and their meanings are listed below:

            status codes and their meanings:
	                200, OK
	                201, Created
	                202, Accepted
	                301, Moved Permanently
	                303, See Other
	                304, Not Modified
	                307, Temporary Redirect
	                400, Bad Request
	                401, Unauthorized
	                403, Forbidden
	                404, Not Found
	                410, Gone
	                500, Internal Server Error
	                503, Service Unavailable


         declare an int variable called statusCode, and a vlaid status code is already given
         write a program that prints out, on a line by itself, the appropriate label from the above list based on status.

                    Example:
                        if status code = 200

                    output:
                        ok

            NOTE: MUST USE TERNARY.

 */