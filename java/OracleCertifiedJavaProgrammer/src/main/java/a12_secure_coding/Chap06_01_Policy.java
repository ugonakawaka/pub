package a12_secure_coding;

import java.io.FilePermission;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.AccessControlException;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.Permissions;
import java.security.Policy;
import java.security.ProtectionDomain;

// ！注意！
// 実行時のVM引数に以下を追加しておく
// -Djava.security.manager -Djava.security.policy=security.policy
//
//！注意！
// このコードはjava17で試しているため、あちらこちらdeprecatedが発生している
//
// 参考)
// https://github.com/katohideyuki/JavaGold/tree/main/Study/12/chapter_06
//
//  Oracleのドキュメントは
// https://docs.oracle.com/en/java/javase/17/security/index.html
@SuppressWarnings("removal")
public class Chap06_01_Policy {

	public static void main(String[] args) {
		a();
	}

	@FunctionalInterface
	interface Printer<T> {
		@SuppressWarnings("removal")
		void print(T t) throws Exception, AccessControlException;
	}

	/* パスを文字列で受け取り、その直下にあるディレクトリ,ファイルを出力する */
	static Printer<String> printer = path -> {
		Files.list(Paths.get(path)).forEach(p -> System.out.println(p.getFileName()));
	};

	@SuppressWarnings("removal")
	static class SamplePolicy extends Policy {
		private final PermissionCollection permissions;

		public SamplePolicy(PermissionCollection permissions) {
			this.permissions = permissions;
		}

		@Override
		public boolean implies(ProtectionDomain domain, Permission permission) {
			return permissions.implies(permission);
		}
	}

	
	
	@SuppressWarnings({ "removal", "deprecation" })
	static void a() {

		System.out.println("policy fileが設定されているはず");
		// ※Policyは、java17からDeprecatedに指定されている
		// Policyオブジェクトは、
		// Java Runtime Environment内で実行されるコードにセキュリティ依存の操作を実行するアクセス権があるかどうかの判定を行う
		// 実行時にインストールされるPolicyオブジェクトは、常に1つだけ
		try {
			printer.print(".");
		} catch (Exception e) {
			System.out.printf("許可がないので例外:%s%n", e);
		}
	
		System.out.println("FilePermissionで読み込み権限をつける");
		var permission = new FilePermission(".", "read");
		Permissions permissions = new Permissions();
		permissions.add(permission);
		Policy.setPolicy(new SamplePolicy(permissions));
		System.out.println("権限があるので読み込みができる");
		try {
			printer.print(".");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
