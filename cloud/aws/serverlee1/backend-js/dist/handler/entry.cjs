"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.handler = void 0;
const handler = async (event) => {
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
exports.handler = handler;
function groupUsersByCriteria(users) {
    // ここでユーザをグループ分けするロジックを実装
    // サンプルとして、IDが奇数か偶数かでグループ分け
    const group1 = users.filter(user => user.id % 2 === 0);
    const group2 = users.filter(user => user.id % 2 !== 0);
    return [group1, group2];
}
