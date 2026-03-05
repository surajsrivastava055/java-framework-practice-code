package com.gyan.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.gyan.dto.CommentDetailsResponse;
import com.gyan.dto.StoreProductRequest;
import com.gyan.dto.StoreProductResponse;

@Service
public class FakeApiService {

	public StoreProductResponse addNewProduct(StoreProductRequest request) {
		//url="https://fakestoreapi.com/products";
		//method: POST
		// Body:yes
		/*
		 *  {
			  "title": "string",
			  "price": 0.1,
			  "description": "string",
			  "category": "string",
			  "image": "http://example.com"
			}
		 */
		//Response Body/Entity: Yes
		/*
		 *  {
		 	  "id":12,
			  "title": "string",
			  "price": 0.1,
			  "description": "string",
			  "category": "string",
			  "image": "http://example.com"
			}
		 */
		//header:No
		//Path Variable: No,
		// Query Params: No
		HttpEntity<StoreProductRequest> httpEntity=new HttpEntity<StoreProductRequest>(request);
		String url="https://fakestoreapi.com/products";
		RestTemplate restTemplate=new RestTemplate();
		ResponseEntity<StoreProductResponse> data=restTemplate.exchange(url, HttpMethod.POST, httpEntity,StoreProductResponse.class);
		return data.getBody();
	}
	
	
	public StoreProductResponse getProductInfo(int id) {
		//url='https://fakestoreapi.com/products/{id}";
		//method: GET
		//Request Body:No
		//Response Body: Yes
		/*
		 *  {
		 	  "id":12,
			  "title": "string",
			  "price": 0.1,
			  "description": "string",
			  "category": "string",
			  "image": "http://example.com"
			}
		 */
		//header:No
		//Path Variable: Yes,
		// Query Params: No
		
		String url="https://fakestoreapi.com/products/{productId}";
		RestTemplate rest=new RestTemplate();
		//return rest.exchange(url, HttpMethod.GET, null,StoreProductResponse.class , id).getBody();
		//OR the below one is more reliable for when we have more then 1 path variable.
		Map<String,Integer> pathVariable=new HashMap<>();
		pathVariable.put("productId", id);
		return rest.exchange(url, HttpMethod.GET, null,StoreProductResponse.class, pathVariable).getBody();
	}
	
	public List<CommentDetailsResponse> getComment(String postId) {
		//url="https://jsonplaceholder.typicode.com/comments?postId=1";
		//method: GET
		//Request Body:No
		//Response Body: Yes
		/*
		 *  {
		 		"postId": 1,
		        "id": 1,
		        "name": "id labore ex et quam laborum",
		        "email": "Eliseo@gardner.biz",
		        "body": "laudantium enim quasi\nreiciendis et nam sapiente accusantium"
			}
		 */
		//header:No
		//Path Variable: Yes,
		// Query Params: No
		String url="https://jsonplaceholder.typicode.com/comments?postId={id}";
		RestTemplate rest=new RestTemplate();
		return rest.exchange(url, HttpMethod.GET, null, List.class, postId).getBody();
	}

}
