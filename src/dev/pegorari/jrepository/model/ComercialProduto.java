package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ComercialProduto extends AbstractSankhyaEntity<ComercialProduto> {
   public BigDecimal getQtdPedVda() {
        return this.getVo().asBigDecimal("QTDPEDVDA");
   }

   public void setQtdPedVda(BigDecimal qtdPedVda) {
        markAsChanged("QTDPEDVDA", qtdPedVda);
   }

   public BigDecimal getValor() {
        return this.getVo().asBigDecimal("VALOR");
   }

   public void setValor(BigDecimal valor) {
        markAsChanged("VALOR", valor);
   }

   public BigDecimal getQtdPed() {
        return this.getVo().asBigDecimal("QTDPED");
   }

   public void setQtdPed(BigDecimal qtdPed) {
        markAsChanged("QTDPED", qtdPed);
   }

   public BigDecimal getCodForn() {
        return this.getVo().asBigDecimal("CODFORN");
   }

   public void setCodForn(BigDecimal codForn) {
        markAsChanged("CODFORN", codForn);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public Timestamp getDtPrevInst() {
        return this.getVo().asTimestamp("DTPREVINST");
   }

   public void setDtPrevInst(Timestamp dtPrevInst) {
        markAsChanged("DTPREVINST", dtPrevInst);
   }

   public BigDecimal getGrupo() {
        return this.getVo().asBigDecimal("GRUPO");
   }

   public void setGrupo(BigDecimal grupo) {
        markAsChanged("GRUPO", grupo);
   }

   public String getImpNota() {
        return this.getVo().asString("IMPNOTA");
   }

   public void setImpNota(String impNota) {
        markAsChanged("IMPNOTA", impNota);
   }

   public String getImpOs() {
        return this.getVo().asString("IMPOS");
   }

   public void setImpOs(String impOs) {
        markAsChanged("IMPOS", impOs);
   }

   public BigDecimal getNumContrato() {
        return this.getVo().asBigDecimal("NUMCONTRATO");
   }

   public void setNumContrato(BigDecimal numContrato) {
        markAsChanged("NUMCONTRATO", numContrato);
   }

   public String getPrincipal() {
        return this.getVo().asString("PRINCIPAL");
   }

   public void setPrincipal(String principal) {
        markAsChanged("PRINCIPAL", principal);
   }

   public BigDecimal getQtdNeg() {
        return this.getVo().asBigDecimal("QTDNEG");
   }

   public void setQtdNeg(BigDecimal qtdNeg) {
        markAsChanged("QTDNEG", qtdNeg);
   }

   public String getComplDesc() {
        return this.getVo().asString("COMPLDESC");
   }

   public void setComplDesc(String complDesc) {
        markAsChanged("COMPLDESC", complDesc);
   }

   public BigDecimal getQtdPedIr() {
        return this.getVo().asBigDecimal("QTDPEDIR");
   }

   public void setQtdPedIr(BigDecimal qtdPedIr) {
        markAsChanged("QTDPEDIR", qtdPedIr);
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
        this.setVo(vo);
        return this;
   }
}
