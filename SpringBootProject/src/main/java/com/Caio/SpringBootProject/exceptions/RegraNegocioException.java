package com.Caio.SpringBootProject.exceptions;

public class RegraNegocioException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// excessao em tempo de execucao
	public RegraNegocioException (String msg) {
		super(msg);
	}
}
