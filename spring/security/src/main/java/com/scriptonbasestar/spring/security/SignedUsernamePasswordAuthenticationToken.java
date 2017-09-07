/**
 *
 */
package com.scriptonbasestar.spring.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;


/**
 * Implements a type of signed request, where the request signature is included
 * with the credentials provided by the user.
 *
 * @author Mularien
 */
public class SignedUsernamePasswordAuthenticationToken
		extends UsernamePasswordAuthenticationToken {

	@Getter
	@Setter
	private String requestSignature;

	/**
	 * For serialization.
	 */
	private static final long serialVersionUID = 3145548673810647886L;

	/**
	 * Construct a new token instance with the given principal, credentials, and
	 * signature.
	 *
	 * @param principal   the principal to use
	 * @param credentials the credentials to use
	 * @param signature   the signature to use
	 */
	public SignedUsernamePasswordAuthenticationToken(
			String principal,
			String credentials,
			String signature) {

		super(principal, credentials);
		this.requestSignature = signature;
	}

}
