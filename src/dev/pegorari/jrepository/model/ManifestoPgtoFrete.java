package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.math.BigDecimal;

public class ManifestoPgtoFrete extends AbstractSankhyaEntity<ManifestoPgtoFrete> {
   private String agencia;
   private String codBanco;
   private BigDecimal codParc;
   private BigDecimal codParcIntPgFre;
   private String envio;
   private String indPag;
   private BigDecimal nuViag;
   private BigDecimal seqMdfe;
   private BigDecimal seqPgFre;
   private BigDecimal vlrContrato;
   private String chavePix;

   public String getAgencia() {
        return agencia;
   }

   public void setAgencia(String agencia) {
        markAsChanged("AGENCIA", agencia);
        this.agencia = agencia;
   }

   public String getCodBanco() {
        return codBanco;
   }

   public void setCodBanco(String codBanco) {
        markAsChanged("CODBANCO", codBanco);
        this.codBanco = codBanco;
   }

   public BigDecimal getCodParc() {
        return codParc;
   }

   public void setCodParc(BigDecimal codParc) {
        markAsChanged("CODPARC", codParc);
        this.codParc = codParc;
   }

   public BigDecimal getCodParcIntPgFre() {
        return codParcIntPgFre;
   }

   public void setCodParcIntPgFre(BigDecimal codParcIntPgFre) {
        markAsChanged("CODPARCINTPGFRE", codParcIntPgFre);
        this.codParcIntPgFre = codParcIntPgFre;
   }

   public String getEnvio() {
        return envio;
   }

   public void setEnvio(String envio) {
        markAsChanged("ENVIO", envio);
        this.envio = envio;
   }

   public String getIndPag() {
        return indPag;
   }

   public void setIndPag(String indPag) {
        markAsChanged("INDPAG", indPag);
        this.indPag = indPag;
   }

   public BigDecimal getNuViag() {
        return nuViag;
   }

   public void setNuViag(BigDecimal nuViag) {
        markAsChanged("NUVIAG", nuViag);
        this.nuViag = nuViag;
   }

   public BigDecimal getSeqMdfe() {
        return seqMdfe;
   }

   public void setSeqMdfe(BigDecimal seqMdfe) {
        markAsChanged("SEQMDFE", seqMdfe);
        this.seqMdfe = seqMdfe;
   }

   public BigDecimal getSeqPgFre() {
        return seqPgFre;
   }

   public void setSeqPgFre(BigDecimal seqPgFre) {
        markAsChanged("SEQPGFRE", seqPgFre);
        this.seqPgFre = seqPgFre;
   }

   public BigDecimal getVlrContrato() {
        return vlrContrato;
   }

   public void setVlrContrato(BigDecimal vlrContrato) {
        markAsChanged("VLRCONTRATO", vlrContrato);
        this.vlrContrato = vlrContrato;
   }

   public String getChavePix() {
        return chavePix;
   }

   public void setChavePix(String chavePix) {
        markAsChanged("CHAVEPIX", chavePix);
        this.chavePix = chavePix;
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
        this.agencia = vo.asString("AGENCIA");
        this.codBanco = vo.asString("CODBANCO");
        this.codParc = vo.asBigDecimal("CODPARC");
        this.codParcIntPgFre = vo.asBigDecimal("CODPARCINTPGFRE");
        this.envio = vo.asString("ENVIO");
        this.indPag = vo.asString("INDPAG");
        this.nuViag = vo.asBigDecimal("NUVIAG");
        this.seqMdfe = vo.asBigDecimal("SEQMDFE");
        this.seqPgFre = vo.asBigDecimal("SEQPGFRE");
        this.vlrContrato = vo.asBigDecimal("VLRCONTRATO");
        this.chavePix = vo.asString("CHAVEPIX");
        return this;
   }
}
