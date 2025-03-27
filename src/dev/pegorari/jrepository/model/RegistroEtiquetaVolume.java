package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class RegistroEtiquetaVolume extends AbstractSankhyaEntity<RegistroEtiquetaVolume> {
   public BigDecimal getPeso() {
        return this.getVo().asBigDecimal("PESO");
   }

   public void setPeso(BigDecimal peso) {
        markAsChanged("PESO", peso);
   }

   public BigDecimal getCodUsuConf() {
        return this.getVo().asBigDecimal("CODUSUCONF");
   }

   public void setCodUsuConf(BigDecimal codUsuConf) {
        markAsChanged("CODUSUCONF", codUsuConf);
   }

   public Timestamp getDhFinConf() {
        return this.getVo().asTimestamp("DHFINCONF");
   }

   public void setDhFinConf(Timestamp dhFinConf) {
        markAsChanged("DHFINCONF", dhFinConf);
   }

   public Timestamp getDhImpressao() {
        return this.getVo().asTimestamp("DHIMPRESSAO");
   }

   public void setDhImpressao(Timestamp dhImpressao) {
        markAsChanged("DHIMPRESSAO", dhImpressao);
   }

   public Timestamp getDhInc() {
        return this.getVo().asTimestamp("DHINC");
   }

   public void setDhInc(Timestamp dhInc) {
        markAsChanged("DHINC", dhInc);
   }

   public Timestamp getDhIniConf() {
        return this.getVo().asTimestamp("DHINICONF");
   }

   public void setDhIniConf(Timestamp dhIniConf) {
        markAsChanged("DHINICONF", dhIniConf);
   }

   public String getExigeConf() {
        return this.getVo().asString("EXIGECONF");
   }

   public void setExigeConf(String exigeConf) {
        markAsChanged("EXIGECONF", exigeConf);
   }

   public BigDecimal getIdRev() {
        return this.getVo().asBigDecimal("IDREV");
   }

   public void setIdRev(BigDecimal idRev) {
        markAsChanged("IDREV", idRev);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public BigDecimal getNuSeparacao() {
        return this.getVo().asBigDecimal("NUSEPARACAO");
   }

   public void setNuSeparacao(BigDecimal nuSeparacao) {
        markAsChanged("NUSEPARACAO", nuSeparacao);
   }

   public BigDecimal getSeqEtiqueta() {
        return this.getVo().asBigDecimal("SEQETIQUETA");
   }

   public void setSeqEtiqueta(BigDecimal seqEtiqueta) {
        markAsChanged("SEQETIQUETA", seqEtiqueta);
   }

   public BigDecimal getSequencia() {
        return this.getVo().asBigDecimal("SEQUENCIA");
   }

   public void setSequencia(BigDecimal sequencia) {
        markAsChanged("SEQUENCIA", sequencia);
   }

   public String getNomeImpressora() {
        return this.getVo().asString("NOMEIMPRESSORA");
   }

   public void setNomeImpressora(String nomeImpressora) {
        markAsChanged("NOMEIMPRESSORA", nomeImpressora);
   }

   public BigDecimal getTotVolumes() {
        return this.getVo().asBigDecimal("TOTVOLUMES");
   }

   public void setTotVolumes(BigDecimal totVolumes) {
        markAsChanged("TOTVOLUMES", totVolumes);
   }

   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public String getDescrProd() {
        return this.getVo().asString("DESCRPROD");
   }

   public void setDescrProd(String descrProd) {
        markAsChanged("DESCRPROD", descrProd);
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
        this.setVo(vo);
        return this;
   }
}
