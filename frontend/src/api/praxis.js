import Api from './index';

export const postPeserta = function(data){
    return Api.post('/api/peserta/post', data)
}

export const getKarya = function(){
    return Api.get('/praxis/karya/get')
}

export const postFile = function(data, headers){
    return Api.post('/praxis/data/upload', data, headers)
}

export const postFiles = function(data, headers){
    return Api.post('/praxis/data/uploads', data, headers)
}
