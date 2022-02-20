package a07_generics;

import java.io.Closeable;

// 参考)
// https://github.com/katohideyuki/JavaGold/tree/main/Study/07/chapter_09
public class ChapXx01_bounded {

	static class TypeA {

	}

	static class TypeB extends TypeA {

	}

	static class TypeC extends TypeA {

	}

	static class Holder0<T> {
		T val;

		public Holder0(T val) {
			this.val = val;
		}

		@SuppressWarnings("unchecked")
		public <T1> T1 getVal() {
			return (T1)val;
		}

		@SuppressWarnings("unchecked")
		public void setVal(Object val) {
			this.val = (T)val;
		}
	}
	static class Holder1<T> {
		T val;

		public Holder1(T  val) {
			this.val = val;
		}

		public T getVal() {
			return val;
		}

		public void setVal(Object val) {
			this.val = (T)val;
		}
	}
	public static void main(String[] args) {
		a();
	}

	static void a() {
		// うーん、よくわからないよー
		{
			Holder0<Object> holder = new Holder0<>(new TypeA());
			{
				TypeA o = (TypeA) holder.getVal();
			}
			{
				Object o = holder.getVal();
			}
			{
				var o = holder.getVal();
			}
			System.out.println("=============");
		}
		{
			
			{ // もちろんok
				Holder0<TypeA> holder = new Holder0<>(new TypeA());
				TypeA o = holder.getVal();
				holder.setVal(o);
			}
			{ // ok
				Holder0<TypeA> holder = new Holder0<>(new TypeB());
				TypeA o = holder.getVal();
				holder.setVal(o);
			}
			{ // ok
				Holder0<TypeA> holder = new Holder0<>(new TypeC());
				TypeA o = holder.getVal();
				holder.setVal(o);
			}
			
			{ // ng
				// Holder0<TypeA> holder = new Holder0<>(new Object());
//				TypeA o = holder.getVal();
//				holder.setVal(o);
			}
		}
		{ //

			{
				Holder0<? extends TypeA> holder = new Holder0<>(new TypeA());
				var o = holder.getVal();
				holder.setVal(null);
				holder.setVal(new TypeB());
				holder.setVal(new TypeC());
				System.out.println(o.getClass());
			}
			{
				Holder0<? extends TypeA> holder = new Holder0<>(new TypeB());
				TypeA o = holder.getVal();
				System.out.println(o.getClass());
			}
			{
				Holder0<? extends TypeA> holder = new Holder0<>(new TypeB());
				// Type mismatch: cannot convert
				// TypeB o = holder.getVal();
				TypeB o = (TypeB) holder.getVal();
				System.out.println(o.getClass());
			}
			{
				Holder0<? extends TypeA> holder = new Holder0<>(new TypeC());
				var o = holder.getVal();
				System.out.println(o.getClass());
			}
			{
				Holder0<? extends TypeA> holder = new Holder0<>(new TypeB());
				var o = holder.getVal();
				System.out.println(o.getClass());
			}
			{ // Cannot infer type arguments for Holder<>
//				Holder<? extends TypeB> holder = new Holder<>(new TypeA());
//				var o = holder.getVal();
//				System.out.println(o.getClass());
			}
			{
				Holder0<? extends TypeB> holder = new Holder0<>(new TypeB());
				var o = holder.getVal();
				System.out.println(o.getClass());
			}
			System.out.println("=============");
		}
		{
			{
				Holder0<? super TypeA> holder = new Holder0<>(new TypeA());
				TypeA o = (TypeA) holder.getVal();
				System.out.println(o.getClass());
			}
			{
				Holder0<? super TypeB> holder = new Holder0<>(new TypeA());
				TypeA a = (TypeA) holder.getVal();
				// TypeB b = holder.getVal();
				// TypeC c = (TypeC) holder.getVal();
				// holder.setVal(new TypeA());
				holder.setVal(new TypeC());
				holder.setVal(new TypeB());
				
			}
			{
				Holder0<? super TypeC> holder = new Holder0<>(new TypeC());
				var o = holder.getVal();
				System.out.println(o.getClass());
			}
			{
				Holder0<? super TypeC> holder = new Holder0<>("");
				holder.setVal(new TypeC());
				var o = holder.getVal();
				System.out.println(o.getClass());
			}
			System.out.println("=============");
		}

	}
	
	static void b() {
		
		
		
	}
}
