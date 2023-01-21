package com.nt.exceptions;

public class ActorNotFound extends RuntimeException {
	public ActorNotFound() {
		super();
	}
	public ActorNotFound(String msg) {
		super(msg);
	}
}
