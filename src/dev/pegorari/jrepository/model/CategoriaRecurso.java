package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class CategoriaRecurso extends AbstractSankhyaEntity<CategoriaRecurso> {
   public String getAnalitico() {
        return this.getVo().asString("ANALITICO");
   }

   public void setAnalitico(String analitico) {
        markAsChanged("ANALITICO", analitico);
   }

   public String getAtivo() {
        return this.getVo().asString("ATIVO");
   }

   public void setAtivo(String ativo) {
        markAsChanged("ATIVO", ativo);
   }

   public BigDecimal getCodCre() {
        return this.getVo().asBigDecimal("CODCRE");
   }

   public void setCodCre(BigDecimal codCre) {
        markAsChanged("CODCRE", codCre);
   }

   public BigDecimal getCodCrePai() {
        return this.getVo().asBigDecimal("CODCREPAI");
   }

   public void setCodCrePai(BigDecimal codCrePai) {
        markAsChanged("CODCREPAI", codCrePai);
   }

   public BigDecimal getCodServAponta() {
        return this.getVo().asBigDecimal("CODSERVAPONTA");
   }

   public void setCodServAponta(BigDecimal codServAponta) {
        markAsChanged("CODSERVAPONTA", codServAponta);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getNome() {
        return this.getVo().asString("NOME");
   }

   public void setNome(String nome) {
        markAsChanged("NOME", nome);
   }

   public String getParamSetup() {
        return this.getVo().asString("PARAMSETUP");
   }

   public void setParamSetup(String paramSetup) {
        markAsChanged("PARAMSETUP", paramSetup);
   }

   public String getTipo() {
        return this.getVo().asString("TIPO");
   }

   public void setTipo(String tipo) {
        markAsChanged("TIPO", tipo);
   }

   public String getTipoApontaUso() {
        return this.getVo().asString("TIPOAPONTAUSO");
   }

   public void setTipoApontaUso(String tipoApontaUso) {
        markAsChanged("TIPOAPONTAUSO", tipoApontaUso);
   }

   public String getCodVol() {
        return this.getVo().asString("CODVOL");
   }

   public void setCodVol(String codVol) {
        markAsChanged("CODVOL", codVol);
   }

   public BigDecimal getDecQtd() {
        return this.getVo().asBigDecimal("DECQTD");
   }

   public void setDecQtd(BigDecimal decQtd) {
        markAsChanged("DECQTD", decQtd);
   }

   @Override
   public String getTableName() {
        return "TPRCRE";
   }

   @Override
   public String getEntityName() {
        return "CategoriaRecurso";
   }

   @Override
   public CategoriaRecurso fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
