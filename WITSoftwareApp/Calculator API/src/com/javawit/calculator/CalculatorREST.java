package com.javawit.calculator;

import static spark.Spark.*;
import java.text.DecimalFormat;
import com.javawit.calculator.Response;
import com.google.gson.Gson;

public class CalculatorREST {

	public static void main(String[] args) {
		port(8080);
		get("/add/:first/:second", (request, response) -> {

			System.out.println(request.headers());

			String firstpar = request.params(":first");
			String secondpar = request.params(":second");
			//
			double first = Double.parseDouble(firstpar);
			double second = Double.parseDouble(secondpar);
			DecimalFormat df = new DecimalFormat("####0.0000");
			response.type("application/json");
			double ans =  first + second;

			response.type("application/json");
			Response resp = new Response();
			resp.setStatus("SUCCESS");
			resp.setTransid(System.currentTimeMillis());
			resp.setResult(df.format(ans));

			return new Gson().toJson(resp);

			//TEST in Browser
			//http://127.0.0.1:8080/add/10.1/20.2

		});

		get("/subtract/:first/:second", (request, response) -> {

			String firstpar = request.params(":first");
			String secondpar = request.params(":second");
			//
			double first = Double.parseDouble(firstpar);
			double second = Double.parseDouble(secondpar);
			DecimalFormat df = new DecimalFormat("####0.0000");
			response.type("application/json");
			double ans =  first - second;

			response.type("application/json");
			Response resp = new Response();
			resp.setStatus("SUCCESS");
			resp.setTransid(System.currentTimeMillis());
			resp.setResult(df.format(ans));

			return new Gson().toJson(resp);

			//TEST in Browser
			//http://127.0.0.1:8080/subtract/10.1/20.2

		});

		get("/divide/:first/:second", (request, response) -> {

			String firstpar = request.params(":first");
			String secondpar = request.params(":second");
			//
			double first = Double.parseDouble(firstpar);
			double second = Double.parseDouble(secondpar);
			DecimalFormat df = new DecimalFormat("####0.0000");
			response.type("application/json");
			double ans =  first / second;

			response.type("application/json");
			Response resp = new Response();
			resp.setStatus("SUCCESS");
			resp.setTransid(System.currentTimeMillis());
			resp.setResult(df.format(ans));

			return new Gson().toJson(resp);

			//TEST in Browser
			//http://127.0.0.1:4567/divide/10.1/5.2

		});
		
		get("/multiply/:first/:second", (request, response) -> {

			String firstpar = request.params(":first");
			String secondpar = request.params(":second");
			//
			double first = Double.parseDouble(firstpar);
			double second = Double.parseDouble(secondpar);
			DecimalFormat df = new DecimalFormat("####0.0000");
			response.type("application/json");
			double ans =  (first * second);

			response.type("application/json");
			Response resp = new Response();
			resp.setStatus("SUCCESS");
			resp.setTransid(System.currentTimeMillis());
			resp.setResult(df.format(ans));

			return new Gson().toJson(resp);


			//TEST in Browser
			//http://127.0.0.1:8080/multiply/10.1/5.2
		});

	}  

}
