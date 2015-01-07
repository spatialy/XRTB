package com.xrtb.exchanges;

import java.io.IOException;

import java.io.InputStream;

import org.codehaus.jackson.JsonProcessingException;

import com.xrtb.pojo.BidRequest;

/**
 * A Bid request for Mobclix.
 * @author Ben M. Faul
 *
 */
public class Nexage extends BidRequest {
	
	/**
	 * Make a default constructor, the bidder keeps a representative class instance for each
	 * exchange so it can use a Map to make new bid requests per the format of the bid request.
	 */
	public Nexage() {
		super();
		parseSpecial();
	}
	
	/**
	 * Constructs Nexage bid request from a file containoing JSON
	 * @param in. String - the File name containing the data.
	 * @throws JsonProcessingException on parse errors.
	 * @throws IOException on file reading errors.
	 */	
	public Nexage(String  in) throws JsonProcessingException, IOException {
		super(in);
		parseSpecial();
    }	
	
	/**
	 * Constructs Nexage bid request from JSON stream in jetty.
	 * @param in. InputStream - the JSON data coming from HTTP.
	 * @throws JsonProcessingException on parse errors.
	 * @throws IOException on file reading errors.
	 */
	public Nexage(InputStream in) throws JsonProcessingException,
			IOException {
		super(in);
		parseSpecial();
	}
	
	/**
	 * Create a new Nexage object from this class instance.
	 * @throws JsonProcessingException on parse errors.
	 * @throws IOException on file reading errors
	 */
	public Nexage copy(InputStream in) throws JsonProcessingException, IOException {
		return new Nexage(in);
	}
	
	/**
	 * Process special Nexage stuff, sets the exchange name.
	 */
	@Override
	public boolean parseSpecial() {
		exchange = "nexage";
		return true;
	}
	
}
