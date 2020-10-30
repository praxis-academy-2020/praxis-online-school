<template>
  <div class="grad1">
    <v-row>
      <v-col class="d-flex align-self-center white--text" cols="12" sm="12" md="6">
        <div>
          <h1 class="ml-10">Jadilah Tech Talent Masa Depan!</h1>
          <p
            class="ml-10 mt-5"
          >Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore provident incidunt in eum! Illum, dignissimos recusandae unde ipsa eaque cupiditate provident nemo sint molestiae cum? Est velit necessitatibus autem eligendi.</p>
          <router-link to="/register/syarat" class="text-decoration-none ml-10">
            <v-btn color="#112d4e" class="mt-3 text-capitalize white--text px-10 py-5 m">Daftar</v-btn>
          </router-link>
        </div>
      </v-col>
      <v-col cols="12" sm="12" md="6">
        <v-img class src="@/assets/carousel/hhh.png"></v-img>
      </v-col>
    </v-row>
  </div>
</template>

<style  scoped>
.gambar {
  /* border:1px solid red; */
  margin-top: 25%;
}
.m {
  font-family:Impact, Haettenschweiler, 'Arial Narrow Bold', sans-serif;
  font-size: 107%;
  letter-spacing: 1px;
}
.grad1 {
  background-image: linear-gradient(to top, rgba(255,0,0,0), #0b55d3 50%);
  padding: 100px 0 0 0;
}
</style>