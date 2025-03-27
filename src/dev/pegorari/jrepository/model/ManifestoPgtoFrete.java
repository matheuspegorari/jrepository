package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ManifestoPgtoFrete extends AbstractSankhyaEntity<ManifestoPgtoFrete> {
   public String getAgencia() {
        return this.getVo().asString("AGENCIA");
   }

   public void setAgencia(String agencia) {
        markAsChanged("AGENCIA", agencia);
   }

   public String getCodBanco() {
        return this.getVo().asString("CODBANCO");
   }

   public void setCodBanco(String codBanco) {
        markAsChanged("CODBANCO", codBanco);
   }

   public BigDecimal getCodParc() {
        return this.getVo().asBigDecimal("CODPARC");
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
   }

   public BigDecimal getCodParcIntPgFre() {
        return this.getVo().asBigDecimal("CODPARCINTPGFRE");
   }

   public void setCodParcIntPgFre(BigDecimal codParcIntPgFre) {
        markAsChanged("CODPARCINTPGFRE", codParcIntPgFre);
   }

   public String getEnvio() {
        return this.getVo().asString("ENVIO");
   }

   public void setEnvio(String envio) {
        markAsChanged("ENVIO", envio);
   }

   public String getIndPag() {
        return this.getVo().asString("INDPAG");
   }

   public void setIndPag(String indPag) {
        markAsChanged("INDPAG", indPag);
   }

   public BigDecimal getNuViag() {
        return this.getVo().asBigDecimal("NUVIAG");
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
   }

   public BigDecimal getSeqMdfe() {
        return this.getVo().asBigDecimal("SEQMDFE");
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
   }

   public BigDecimal getSeqPgFre() {
        return this.getVo().asBigDecimal("SEQPGFRE");
   }

   public void setSeqPgFre(BigDecimal seqPgFre) {
        markAsChanged("SEQPGFRE", seqPgFre);
   }

   public BigDecimal getVlrContrato() {
        return this.getVo().asBigDecimal("VLRCONTRATO");
   }

   public void setVlrContrato(BigDecimal vlrContrato) {
        markAsChanged("VLRCONTRATO", vlrContrato);
   }

   public String getChavePix() {
        return this.getVo().asString("CHAVEPIX");
   }

   public void setChavePix(String chavePix) {
        markAsChanged("CHAVEPIX", chavePix);
   }

   @Override
   public String getTableName() {
        return "TGFMDFPGFRE";
   }

   @Override
   public String getEntityName() {
        return "ManifestoPgtoFrete";
   }

   @Override
   public ManifestoPgtoFrete fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
