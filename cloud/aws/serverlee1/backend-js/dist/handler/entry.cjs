"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
module.exports.handler = async (event) => {
    try {
        // ここでユーザをグループに分けるロジックを実装
        const groups = groupUsersByCriteria(event.users);
        return {
            groups: groups
        };
    }
    catch (error) {
        console.error("Error in entryLambda:", error);
        throw error;
    }
};
function groupUsersByCriteria(users) {
    // ここでユーザをグループ分けするロジックを実装
    // サンプルとして、IDが奇数か偶数かでグループ分け
    const group1 = users.filter(user => user.id % 2 === 0);
    const group2 = users.filter(user => user.id % 2 !== 0);
    return [group1, group2];
}
