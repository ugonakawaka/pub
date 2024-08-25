interface Group {
  id: number;
}
interface User {
  groupid: number;
  id: number;
  name: string;
  email: string;
}
export const handler = async (group: Group): Promise<{ users: User[] }> => {
  try {
    // グループごとの処理を行う
    console.log("Processing group:", group);

    // ここで対象のグループからユーザをとりだして次に渡す
    // DBからとりだす感じ
    const users: User[] = [
      { groupid: group.id, id: 0, email: "aaa@test", name: "test0" },
      { groupid: group.id, id: 1, email: "aaa@test", name: "test1" },
    ];

    // 処理結果を次のステートに渡す
    return {
      users: users,
    };
  } catch (error) {
    console.error("Error in processGroupLambda:", error);
    throw error;
  }
};
