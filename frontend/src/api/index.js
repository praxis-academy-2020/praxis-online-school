import axios from 'axios';

const Api = axios.create({
    baseURL: 'http://192.168.43.56:8080'
})

export default Api;