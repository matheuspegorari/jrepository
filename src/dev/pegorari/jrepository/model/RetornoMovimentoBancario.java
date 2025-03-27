package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class RetornoMovimentoBancario extends AbstractSankhyaEntity<RetornoMovimentoBancario> {
   public String getUsaSqlNuFin() {
        return this.getVo().asString("USASQLNUFIN");
   }

   public void setUsaSqlNuFin(String usaSqlNuFin) {
        markAsChanged("USASQLNUFIN", usaSqlNuFin);
   }

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

   public BigDecimal getCodigo() {
        return this.getVo().asBigDecimal("CODIGO");
   }

   public void setCodigo(BigDecimal codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public BigDecimal getCodPai() {
        return this.getVo().asBigDecimal("CODPAI");
   }

   public void setCodPai(BigDecimal codPai) {
        markAsChanged("CODPAI", codPai);
   }

   public String getConcExtBanc() {
        return this.getVo().asString("CONCEXTBANC");
   }

   public void setConcExtBanc(String concExtBanc) {
        markAsChanged("CONCEXTBANC", concExtBanc);
   }

   public BigDecimal getGrau() {
        return this.getVo().asBigDecimal("GRAU");
   }

   public void setGrau(BigDecimal grau) {
        markAsChanged("GRAU", grau);
   }

   public String getSpChamada() {
        return this.getVo().asString("SP_CHAMADA");
   }

   public void setSpChamada(String spChamada) {
        markAsChanged("SP_CHAMADA", spChamada);
   }

   public String getTitulo() {
        return this.getVo().asString("TITULO");
   }

   public void setTitulo(String titulo) {
        markAsChanged("TITULO", titulo);
   }

   public String getConfigTaxaAdmin() {
        return this.getVo().asString("CONFIGTAXAADMIN");
   }

   public void setConfigTaxaAdmin(String configTaxaAdmin) {
        markAsChanged("CONFIGTAXAADMIN", configTaxaAdmin);
   }

   @Override
   public String getTableName() {
        return "TSIRET";
   }

   @Override
   public String getEntityName() {
        return "RetornoMovimentoBancario";
   }

   @Override
   public RetornoMovimentoBancario fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
