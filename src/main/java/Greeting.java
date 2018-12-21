
public class Greeting {
	String content = "";

	public String getHello() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	public void setMessage(String message) {
		// TODO Auto-generated method stub
		this.content = message;
	}

	public String messageTranslation() {
		if (content == "你好")
			return "Hello";
		else
			return "This sentence cannot be translated.";

	}
	public String messageXTranslation() {
		if (content == "你好a")
			return "HelloX";
		else
			return "This sentence cannot be translated.";

	}
}
