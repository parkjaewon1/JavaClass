package ch11;
class FruitBox2<T> {
	T item;
	public void store(T item) {
		this.item = item;
	}
	public Object pullOut() {
		return item;
	}
}

public class FruitBoxEx2 {
	public static void main(String[] args) {
		FruitBox2<Orange> fb = new FruitBox2<>();
		fb.store(new Orange(10));
		Orange og1 = (Orange)fb.pullOut();
		og1.showSugar();
		//fb.store(new Apple(8));		
		// 컴파일할 때는 괜찮지만 실행할 때 에러가 발생
		//Orange og2 = (Orange)fb.pullOut();
		//og2.showSugar();
	}
}