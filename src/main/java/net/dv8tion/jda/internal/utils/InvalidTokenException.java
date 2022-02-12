/*
 * Copyright 2015 Austin Keener, Michael Ritter, Florian Spieß, and the JDA contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.dv8tion.jda.internal.utils;

/**
 * Indicates that an invalid token was given when trying to login the Discord API
 * Replaces {@link javax.security.auth.login.LoginException}
 *
 * @author java-coding-prodigy
 * @since 5.0.0
 * */
public class InvalidTokenException extends RuntimeException
{

    /**
     * Constructs an <code>InvalidTokenException</code> with no detail message.
     * */
    public InvalidTokenException()
    {
        super();
    }
    /**
     * Constructs an <code>InvalidTokenException</code> with the
     * specified detail message.
     *
     * @param  message   
               The detail message.
     */
    public InvalidTokenException(String message)
    {
        super(message);
    }

    

    public InvalidTokenException(String message, Throwable rootCause)
    {
        super(message, rootCause);
    }


}
