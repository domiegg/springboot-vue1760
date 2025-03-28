<template>
  <div>
    <el-form
      class="detail-form-content"
      ref="ruleForm"
      :model="ruleForm"
      label-width="80px"
	  style="background: transparent;"
    >  
     <el-row>
      <el-col :span="12">
        <el-form-item   v-if="flag=='guanzhong'"  label="观众账号" prop="guanzhongzhanghao">
          <el-input v-model="ruleForm.guanzhongzhanghao" readonly              placeholder="观众账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='guanzhong'"  label="观众姓名" prop="guanzhongxingming">
          <el-input v-model="ruleForm.guanzhongxingming"               placeholder="观众姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='guanzhong'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in guanzhongxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='guanzhong'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="guanzhongtouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='guanzhong'"  label="电话号码" prop="dianhuahaoma">
          <el-input v-model="ruleForm.dianhuahaoma"               placeholder="电话号码" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='caipan'"  label="裁判账号" prop="caipanzhanghao">
          <el-input v-model="ruleForm.caipanzhanghao" readonly              placeholder="裁判账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='caipan'"  label="裁判姓名" prop="caipanxingming">
          <el-input v-model="ruleForm.caipanxingming"               placeholder="裁判姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='caipan'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in caipanxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='caipan'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="caipantouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='caipan'"  label="电话号码" prop="dianhuahaoma">
          <el-input v-model="ruleForm.dianhuahaoma"               placeholder="电话号码" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='bisaixuanshou'"  label="选手账号" prop="xuanshouzhanghao">
          <el-input v-model="ruleForm.xuanshouzhanghao" readonly              placeholder="选手账号" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='bisaixuanshou'"  label="选手姓名" prop="xuanshouxingming">
          <el-input v-model="ruleForm.xuanshouxingming"               placeholder="选手姓名" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item v-if="flag=='bisaixuanshou'"  label="性别" prop="xingbie">
          <el-select v-model="ruleForm.xingbie"  placeholder="请选择性别">
            <el-option
                v-for="(item,index) in bisaixuanshouxingbieOptions"
                v-bind:key="index"
                :label="item"
                :value="item">
            </el-option>
          </el-select>
        </el-form-item>
      </el-col>
      <el-col :span="24">  
        <el-form-item v-if="flag=='bisaixuanshou'" label="头像" prop="touxiang">
          <file-upload
          tip="点击上传头像"
          action="file/upload"
          :limit="3"
          :multiple="true"
          :fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
          @change="bisaixuanshoutouxiangUploadChange"
          ></file-upload>
        </el-form-item>
      </el-col>
      <el-col :span="12">
        <el-form-item   v-if="flag=='bisaixuanshou'"  label="电话号码" prop="dianhuahaoma">
          <el-input v-model="ruleForm.dianhuahaoma"               placeholder="电话号码" clearable></el-input>
        </el-form-item>
      </el-col>
      <el-form-item v-if="flag=='users'" label="用户名" prop="username">
        <el-input v-model="ruleForm.username" 
        placeholder="用户名"></el-input>
      </el-form-item>
      <el-col :span="24">
      <el-form-item>
        <el-button type="primary" @click="onUpdateHandler">修 改</el-button>
      </el-form-item>
      </el-col>
      </el-row>
    </el-form>
  </div>
</template>
<script>
// 数字，邮件，手机，url，身份证校验
import { isNumber,isIntNumer,isEmail,isMobile,isPhone,isURL,checkIdCard } from "@/utils/validate";

export default {
  data() {
    return {
      ruleForm: {},
      flag: '',
      usersFlag: false,
      guanzhongxingbieOptions: [],
      caipanxingbieOptions: [],
      bisaixuanshouxingbieOptions: [],
    };
  },
  mounted() {
    var table = this.$storage.get("sessionTable");
    this.flag = table;
    this.$http({
      url: `${this.$storage.get("sessionTable")}/session`,
      method: "get"
    }).then(({ data }) => {
      if (data && data.code === 0) {
        this.ruleForm = data.data;
      } else {
        this.$message.error(data.msg);
      }
    });
    this.guanzhongxingbieOptions = "男,女".split(',')
    this.caipanxingbieOptions = "男,女".split(',')
    this.bisaixuanshouxingbieOptions = "男,女".split(',')
  },
  methods: {
    guanzhongtouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    caipantouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    bisaixuanshoutouxiangUploadChange(fileUrls) {
        this.ruleForm.touxiang = fileUrls;
    },
    onUpdateHandler() {
      if((!this.ruleForm.guanzhongzhanghao)&& 'guanzhong'==this.flag){
        this.$message.error('观众账号不能为空');
        return
      }
      if((!this.ruleForm.guanzhongxingming)&& 'guanzhong'==this.flag){
        this.$message.error('观众姓名不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'guanzhong'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'guanzhong' ==this.flag && this.ruleForm.dianhuahaoma&&(!isMobile(this.ruleForm.dianhuahaoma))){
        this.$message.error(`电话号码应输入手机格式`);
        return
      }
      if((!this.ruleForm.caipanzhanghao)&& 'caipan'==this.flag){
        this.$message.error('裁判账号不能为空');
        return
      }
      if((!this.ruleForm.caipanxingming)&& 'caipan'==this.flag){
        this.$message.error('裁判姓名不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'caipan'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'caipan' ==this.flag && this.ruleForm.dianhuahaoma&&(!isMobile(this.ruleForm.dianhuahaoma))){
        this.$message.error(`电话号码应输入手机格式`);
        return
      }
      if((!this.ruleForm.xuanshouzhanghao)&& 'bisaixuanshou'==this.flag){
        this.$message.error('选手账号不能为空');
        return
      }
      if((!this.ruleForm.xuanshouxingming)&& 'bisaixuanshou'==this.flag){
        this.$message.error('选手姓名不能为空');
        return
      }
      if((!this.ruleForm.mima)&& 'bisaixuanshou'==this.flag){
        this.$message.error('密码不能为空');
        return
      }
        if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
        }
      if( 'bisaixuanshou' ==this.flag && this.ruleForm.dianhuahaoma&&(!isMobile(this.ruleForm.dianhuahaoma))){
        this.$message.error(`电话号码应输入手机格式`);
        return
      }
      if('users'==this.flag && this.ruleForm.username.trim().length<1) {
	this.$message.error(`用户名不能为空`);
        return	
      }
      this.$http({
        url: `${this.$storage.get("sessionTable")}/update`,
        method: "post",
        data: this.ruleForm
      }).then(({ data }) => {
        if (data && data.code === 0) {
          this.$message({
            message: "修改信息成功",
            type: "success",
            duration: 1500,
            onClose: () => {
            }
          });
        } else {
          this.$message.error(data.msg);
        }
      });
    }
  }
};
</script>
<style lang="scss" scoped>
</style>
