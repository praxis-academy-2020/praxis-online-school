<template>
<v-container>
  <v-row>
			<v-col cols="12">
				<div class="card card-floating">
					<div class="card-body card-padding d-md-flex align-items-center">
						<div>
							<h5 class="card-title no-margin">Belajar programming dengan para ahli dalam bidangnya
							</h5>
							<p class="no-margin text-muted">Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod</p>
						</div>
						<div class="ml-auto">
							<a href="/register/syarat" class="btn" style="text-decoration: none">Belajar Sekarang</a>
						</div>
					</div>
				</div>
       
			</v-col>
		</v-row>
</v-container>
  
  
</template>
<style scoped>
.no-margin{
	margin: 0px;
}
.border-line{
	position: relative;
}
.border-line::before{
	content: "";
	position: absolute;
	display: block;
	height: 1px;
	background-color: #d0d0d0;
	left: -500px;
	right: -500px;
	top: 50%;
  
}
.card-floating{
	border-top: 5px solid #5bacf3;
	box-shadow: 0px 2px 15px rgba(0,0,0,0.1);
  
}
.card-padding{
	padding: 30px;
}
.card-tittle{
	font-weight: 300;
}

</style>