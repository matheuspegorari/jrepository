package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroEtiquetaVolume extends AbstractSankhyaEntity<RegistroEtiquetaVolume> {
   private BigDecimal peso;
   private BigDecimal codUsuConf;
   private Timestamp dhFinConf;
   private Timestamp dhImpressao;
   private Timestamp dhInc;
   private Timestamp dhIniConf;
   private String exigeConf;
   private BigDecimal idRev;
   private BigDecimal nuNota;
   private BigDecimal nuSeparacao;
   private BigDecimal seqEtiqueta;
   private BigDecimal sequencia;
   private String nomeImpressora;
   private BigDecimal totVolumes;
   private BigDecimal codProd;
   private String descrProd;

   public BigDecimal getPeso() {
        return peso;
   }

   public void setPeso(BigDecimal peso) {
        this.peso = peso;
   }

   public BigDecimal getCodUsuConf() {
        return codUsuConf;
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        this.codUsuConf = codUsuConf;
   }

   public Timestamp getDhFinConf() {
        return dhFinConf;
   }

   public void setDhFinConf(Timestamp dhFinConf) {
        this.dhFinConf = dhFinConf;
   }

   public Timestamp getDhImpressao() {
        return dhImpressao;
   }

   public void setDhImpressao(Timestamp dhImpressao) {
        this.dhImpressao = dhImpressao;
   }

   public Timestamp getDhInc() {
        return dhInc;
   }

   public void setDhInc(Timestamp dhInc) {
        this.dhInc = dhInc;
   }

   public Timestamp getDhIniConf() {
        return dhIniConf;
   }

   public void setDhIniConf(Timestamp dhIniConf) {
        this.dhIniConf = dhIniConf;
   }

   public String getExigeConf() {
        return exigeConf;
   }

   public void setExigeConf(String exigeConf) {
        this.exigeConf = exigeConf;
   }

   public BigDecimal getIdRev() {
        return idRev;
   }

   public void setIdRev(BigDecimal idRev) {
        this.idRev = idRev;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getNuSeparacao() {
        return nuSeparacao;
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        this.nuSeparacao = nuSeparacao;
   }

   public BigDecimal getSeqEtiqueta() {
        return seqEtiqueta;
   }

   public void setSeqEtiqueta(BigDecimal seqEtiqueta) {
        this.seqEtiqueta = seqEtiqueta;
   }

   public BigDecimal getSequencia() {
        return sequencia;
   }

   public void setSequencia(BigDecimal sequencia) {
        this.sequencia = sequencia;
   }

   public String getNomeImpressora() {
        return nomeImpressora;
   }

   public void setNomeImpressora(String nomeImpressora) {
        this.nomeImpressora = nomeImpressora;
   }

   public BigDecimal getTotVolumes() {
        return totVolumes;
   }

   public void setTotVolumes(BigDecimal totVolumes) {
        this.totVolumes = totVolumes;
   }

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        this.codProd = codProd;
   }

   public String getDescrProd() {
        return descrProd;
   }

   public void setDescrProd(String descrProd) {
        this.descrProd = descrProd;
   }

   @Override
   public String getTableName() {
        return "TGWREV";
   }

   @Override
   public String getEntityName() {
        return "RegistroEtiquetaVolume";
   }

   @Override
   public RegistroEtiquetaVolume fromVO(DynamicVO vo) {
        this.peso = vo.asBigDecimal("PESO");
        this.codUsuConf = vo.asBigDecimal("CODUSUCONF");
        this.dhFinConf = vo.asTimestamp("DHFINCONF");
        this.dhImpressao = vo.asTimestamp("DHIMPRESSAO");
        this.dhInc = vo.asTimestamp("DHINC");
        this.dhIniConf = vo.asTimestamp("DHINICONF");
        this.exigeConf = vo.asString("EXIGECONF");
        this.idRev = vo.asBigDecimal("IDREV");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.nuSeparacao = vo.asBigDecimal("NUSEPARACAO");
        this.seqEtiqueta = vo.asBigDecimal("SEQETIQUETA");
        this.sequencia = vo.asBigDecimal("SEQUENCIA");
        this.nomeImpressora = vo.asString("NOMEIMPRESSORA");
        this.totVolumes = vo.asBigDecimal("TOTVOLUMES");
        this.codProd = vo.asBigDecimal("CODPROD");
        this.descrProd = vo.asString("DESCRPROD");
        return this;
   }
}
