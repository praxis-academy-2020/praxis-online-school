<template>
    <div class="grey lighten-4">
        <v-container>
            <v-row>
                <v-col cols="12" md="5" class="a">
                    <img :src="src" alt="image" width="350px" />
                </v-col>
                <v-col cols="12" md="7" class="a">
                    <div class="py-5 b">
                        <p class="c"><strong>{{judul}}</strong></p>
                        <p class="d">{{keterangan}}</p>
                    </div>
                    </v-col>
            </v-row>
        </v-container>
    </div>
</template>

<script>
export default {
    props:['src','judul','keterangan']
}
</script>

<style scoped>

.b{
   
    margin-top: 12%;  
}
.c{
    text-align: center;
    font-size: 30px;
}
.d{
    font-size: 19px;
}
</style>