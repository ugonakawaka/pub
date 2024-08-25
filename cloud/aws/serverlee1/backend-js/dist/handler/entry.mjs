export const handler = async (event) => {
    try {
        // usersが存在しない場合は空のグループを返す
        const groups = event?.groups ?? [];
        return {
            filteredGroup: filteredGroup(groups),
        };
    }
    catch (error) {
        console.error("Error in entryLambda:", error);
        throw error; // エラーハンドリングが必要な場合に備えて再スロー
    }
};
function filteredGroup(groups) {
    // user.idが存在しないユーザーをスキップ
    const group = groups.filter((group) => group.id !== undefined);
    return group;
}
