const axios = require('axios');
module.exports.select = async (event) => {
    const response = await axios.get('https://deiji.jp');
    return {
        statusCode: 200,
        body: JSON.stringify({
            message: 'Hello, World!',
            data: response.data
        }, null, 2),
    };
};
export {};
