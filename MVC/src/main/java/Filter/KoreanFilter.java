package Filter;

import java.io.FileFilter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
 
 
 


@WebFilter("/*")
public class KoreanFilter implements   Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("한글필터 설정 완료");
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset = UTF-8");

		chain.doFilter(request, response);
		
	}

	 
	



}
