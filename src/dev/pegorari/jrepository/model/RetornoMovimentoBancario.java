package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.math.BigDecimal;

public class RetornoMovimentoBancario implements SankhyaEntity<RetornoMovimentoBancario> {

   private String usaSqlNuFin;
   private String analitico;
   private String ativo;
   private BigDecimal codigo;
   private BigDecimal codPai;
   private String concExtBanc;
   private BigDecimal grau;
   private String spChamada;
   private String titulo;
   private String configTaxaAdmin;

   public String getUsaSqlNuFin() {
        return usaSqlNuFin;
   }

   public void setUsaSqlNuFin(String usaSqlNuFin) {
        this.usaSqlNuFin = usaSqlNuFin;
   }

   public String getAnalitico() {
        return analitico;
   }

   public void setAnalitico(String analitico) {
        this.analitico = analitico;
   }

   public String getAtivo() {
        return ativo;
   }

   public void setAtivo(String ativo) {
        this.ativo = ativo;
   }

   public BigDecimal getCodigo() {
        return codigo;
   }

   public void setCodigo(BigDecimal codigo) {
        this.codigo = codigo;
   }

   public BigDecimal getCodPai() {
        return codPai;
   }

   public void setCodPai(BigDecimal codPai) {
        this.codPai = codPai;
   }

   public String getConcExtBanc() {
        return concExtBanc;
   }

   public void setConcExtBanc(String concExtBanc) {
        this.concExtBanc = concExtBanc;
   }

   public BigDecimal getGrau() {
        return grau;
   }

   public void setGrau(BigDecimal grau) {
        this.grau = grau;
   }

   public String getSpChamada() {
        return spChamada;
   }

   public void setSpChamada(String spChamada) {
        this.spChamada = spChamada;
   }

   public String getTitulo() {
        return titulo;
   }

   public void setTitulo(String titulo) {
        this.titulo = titulo;
   }

   public String getConfigTaxaAdmin() {
        return configTaxaAdmin;
   }

   public void setConfigTaxaAdmin(String configTaxaAdmin) {
        this.configTaxaAdmin = configTaxaAdmin;
   }

   @Override
   public String getEntityName() {
        return "RetornoMovimentoBancario";
   }

   @Override
   public RetornoMovimentoBancario fromVO(DynamicVO vo) {
        this.usaSqlNuFin = vo.asString("USASQLNUFIN");
        this.analitico = vo.asString("ANALITICO");
        this.ativo = vo.asString("ATIVO");
        this.codigo = vo.asBigDecimal("CODIGO");
        this.codPai = vo.asBigDecimal("CODPAI");
        this.concExtBanc = vo.asString("CONCEXTBANC");
        this.grau = vo.asBigDecimal("GRAU");
        this.spChamada = vo.asString("SPCHAMADA");
        this.titulo = vo.asString("TITULO");
        this.configTaxaAdmin = vo.asString("CONFIGTAXAADMIN");
        return this;
   }
}
