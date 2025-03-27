package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class Campo extends AbstractSankhyaEntity<Campo> {
   public String getApresentacao() {
        return this.getVo().asString("APRESENTACAO");
   }

   public void setApresentacao(String apresentacao) {
        markAsChanged("APRESENTACAO", apresentacao);
   }

   public String getCalculado() {
        return this.getVo().asString("CALCULADO");
   }

   public void setCalculado(String calculado) {
        markAsChanged("CALCULADO", calculado);
   }

   public String getDescrcampo() {
        return this.getVo().asString("DESCRCAMPO");
   }

   public void setDescrcampo(String descrcampo) {
        markAsChanged("DESCRCAMPO", descrcampo);
   }

   public String getExpressao() {
        return this.getVo().asString("EXPRESSAO");
   }

   public void setExpressao(String expressao) {
        markAsChanged("EXPRESSAO", expressao);
   }

   public String getMascara() {
        return this.getVo().asString("MASCARA");
   }

   public void setMascara(String mascara) {
        markAsChanged("MASCARA", mascara);
   }

   public String getNomecampo() {
        return this.getVo().asString("NOMECAMPO");
   }

   public void setNomecampo(String nomecampo) {
        markAsChanged("NOMECAMPO", nomecampo);
   }

   public String getNometab() {
        return this.getVo().asString("NOMETAB");
   }

   public void setNometab(String nometab) {
        markAsChanged("NOMETAB", nometab);
   }

   public BigDecimal getNucampo() {
        return this.getVo().asBigDecimal("NUCAMPO");
   }

   public void setNucampo(BigDecimal nucampo) {
        markAsChanged("NUCAMPO", nucampo);
   }

   public BigDecimal getOrdem() {
        return this.getVo().asBigDecimal("ORDEM");
   }

   public void setOrdem(BigDecimal ordem) {
        markAsChanged("ORDEM", ordem);
   }

   public String getPermitepadrao() {
        return this.getVo().asString("PERMITEPADRAO");
   }

   public void setPermitepadrao(String permitepadrao) {
        markAsChanged("PERMITEPADRAO", permitepadrao);
   }

   public String getPermitepesquisa() {
        return this.getVo().asString("PERMITEPESQUISA");
   }

   public void setPermitepesquisa(String permitepesquisa) {
        markAsChanged("PERMITEPESQUISA", permitepesquisa);
   }

   public String getSistema() {
        return this.getVo().asString("SISTEMA");
   }

   public void setSistema(String sistema) {
        markAsChanged("SISTEMA", sistema);
   }

   public BigDecimal getTamanho() {
        return this.getVo().asBigDecimal("TAMANHO");
   }

   public void setTamanho(BigDecimal tamanho) {
        markAsChanged("TAMANHO", tamanho);
   }

   public String getTipcampo() {
        return this.getVo().asString("TIPCAMPO");
   }

   public void setTipcampo(String tipcampo) {
        markAsChanged("TIPCAMPO", tipcampo);
   }

   public String getTipoapresentacao() {
        return this.getVo().asString("TIPOAPRESENTACAO");
   }

   public void setTipoapresentacao(String tipoapresentacao) {
        markAsChanged("TIPOAPRESENTACAO", tipoapresentacao);
   }

   public String getVisivelgridpesquisa() {
        return this.getVo().asString("VISIVELGRIDPESQUISA");
   }

   public void setVisivelgridpesquisa(String visivelgridpesquisa) {
        markAsChanged("VISIVELGRIDPESQUISA", visivelgridpesquisa);
   }

   public String getRequerido() {
        return this.getVo().asString("REQUERIDO");
   }

   public void setRequerido(String requerido) {
        markAsChanged("REQUERIDO", requerido);
   }

   @Override
   public String getTableName() {
        return "TDDCAM";
   }

   @Override
   public String getEntityName() {
        return "Campo";
   }

   @Override
   public Campo fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
