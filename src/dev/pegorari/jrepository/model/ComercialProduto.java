package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComercialProduto implements SankhyaEntity<ComercialProduto> {

   private BigDecimal qtdPedVda;
   private BigDecimal valor;
   private BigDecimal qtdPed;
   private BigDecimal codForn;
   private BigDecimal codProd;
   private Timestamp dtPrevInst;
   private BigDecimal grupo;
   private String impNota;
   private String impOs;
   private BigDecimal numContrato;
   private String principal;
   private BigDecimal qtdNeg;
   private String complDesc;
   private BigDecimal qtdPedIr;

   public BigDecimal getQtdPedVda() {
        return qtdPedVda;
   }

   public void setQtdPedVda(BigDecimal qtdPedVda) {
        this.qtdPedVda = qtdPedVda;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        this.valor = valor;
   }

   public BigDecimal getQtdPed() {
        return qtdPed;
   }

   public void setQtdPed(BigDecimal qtdPed) {
        this.qtdPed = qtdPed;
   }

   public BigDecimal getCodForn() {
        return codForn;
   }

   public void setCodForn(BigDecimal codForn) {
        this.codForn = codForn;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public Timestamp getDtPrevInst() {
        return dtPrevInst;
   }

   public void setDtPrevInst(Timestamp dtPrevInst) {
        this.dtPrevInst = dtPrevInst;
   }

   public BigDecimal getGrupo() {
        return grupo;
   }

   public void setGrupo(BigDecimal grupo) {
        this.grupo = grupo;
   }

   public String getImpNota() {
        return impNota;
   }

   public void setImpNota(String impNota) {
        this.impNota = impNota;
   }

   public String getImpOs() {
        return impOs;
   }

   public void setImpOs(String impOs) {
        this.impOs = impOs;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        this.numContrato = numContrato;
   }

   public String getPrincipal() {
        return principal;
   }

   public void setPrincipal(String principal) {
        this.principal = principal;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        this.qtdNeg = qtdNeg;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        this.complDesc = complDesc;
   }

   public BigDecimal getQtdPedIr() {
        return qtdPedIr;
   }

   public void setQtdPedIr(BigDecimal qtdPedIr) {
        this.qtdPedIr = qtdPedIr;
   }

   @Override
   public String getEntityName() {
        return "ComercialProduto";
   }

   @Override
   public ComercialProduto fromVO(DynamicVO vo) {
        this.qtdPedVda = vo.asBigDecimal("QTDPEDVDA");
        this.valor = vo.asBigDecimal("VALOR");
        this.qtdPed = vo.asBigDecimal("QTDPED");
        this.codForn = vo.asBigDecimal("CODFORN");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.dtPrevInst = vo.asTimestamp("DTPREVINST");
        this.grupo = vo.asBigDecimal("GRUPO");
        this.impNota = vo.asString("IMPNOTA");
        this.impOs = vo.asString("IMPOS");
        this.numContrato = vo.asBigDecimal("NUMCONTRATO");
        this.principal = vo.asString("PRINCIPAL");
        this.qtdNeg = vo.asBigDecimal("QTDNEG");
        this.complDesc = vo.asString("COMPLDESC");
        this.qtdPedIr = vo.asBigDecimal("QTDPEDIR");
        return this;
   }
}
