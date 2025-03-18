package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComercialProduto extends AbstractSankhyaEntity<ComercialProduto> {
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
        markAsChanged("QTDPEDVDA", qtdPedVda);
        this.qtdPedVda = qtdPedVda;
   }

   public BigDecimal getValor() {
        return valor;
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
        this.valor = valor;
   }

   public BigDecimal getQtdPed() {
        return qtdPed;
   }

   public void setQtdPed(BigDecimal qtdPed) {
        markAsChanged("QTDPED", qtdPed);
        this.qtdPed = qtdPed;
   }

   public BigDecimal getCodForn() {
        return codForn;
   }

   public void setCodForn(BigDecimal codForn) {
        markAsChanged("CODFORN", codForn);
        this.codForn = codForn;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public Timestamp getDtPrevInst() {
        return dtPrevInst;
   }

   public void setDtPrevInst(Timestamp dtPrevInst) {
        markAsChanged("DTPREVINST", dtPrevInst);
        this.dtPrevInst = dtPrevInst;
   }

   public BigDecimal getGrupo() {
        return grupo;
   }

   public void setGrupo(BigDecimal grupo) {
        markAsChanged("GRUPO", grupo);
        this.grupo = grupo;
   }

   public String getImpNota() {
        return impNota;
   }

   public void setImpNota(String impNota) {
        markAsChanged("IMPNOTA", impNota);
        this.impNota = impNota;
   }

   public String getImpOs() {
        return impOs;
   }

   public void setImpOs(String impOs) {
        markAsChanged("IMPOS", impOs);
        this.impOs = impOs;
   }

   public BigDecimal getNumContrato() {
        return numContrato;
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
        this.numContrato = numContrato;
   }

   public String getPrincipal() {
        return principal;
   }

   public void setPrincipal(String principal) {
        markAsChanged("PRINCIPAL", principal);
        this.principal = principal;
   }

   public BigDecimal getQtdNeg() {
        return qtdNeg;
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
        this.qtdNeg = qtdNeg;
   }

   public String getComplDesc() {
        return complDesc;
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
        this.complDesc = complDesc;
   }

   public BigDecimal getQtdPedIr() {
        return qtdPedIr;
   }

   public void setQtdPedIr(BigDecimal qtdPedIr) {
        markAsChanged("QTDPEDIR", qtdPedIr);
        this.qtdPedIr = qtdPedIr;
   }

   @Override
   public String getTableName() {
        return "TCSCPR";
   }

   @Override
   public String getEntityName() {
        return "ComercialProduto";
   }

   @Override
   public ComercialProduto fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
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
