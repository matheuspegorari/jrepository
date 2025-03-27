package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoSerie extends AbstractSankhyaEntity<HistoricoSerie> {
   public BigDecimal getCodProd() {
        return this.getVo().asBigDecimal("CODPROD");
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDhAlter() {
        return this.getVo().asTimestamp("DHALTER");
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
   }

   public BigDecimal getNuNota() {
        return this.getVo().asBigDecimal("NUNOTA");
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
   }

   public String getOcorrencia() {
        return this.getVo().asString("OCORRENCIA");
   }

   public void setOcorrencia(String ocorrencia) {
        markAsChanged("OCORRENCIA", ocorrencia);
   }

   public BigDecimal getSeqHistSerie() {
        return this.getVo().asBigDecimal("SEQHISTSERIE");
   }

   public void setSeqHistSerie(BigDecimal seqHistSerie) {
        markAsChanged("SEQHISTSERIE", seqHistSerie);
   }

   public BigDecimal getSeqNota() {
        return this.getVo().asBigDecimal("SEQNOTA");
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
   }

   public String getSerie() {
        return this.getVo().asString("SERIE");
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
   }

   public String getStatus() {
        return this.getVo().asString("STATUS");
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
   }

   @Override
   public String getTableName() {
        return "TGFHSE";
   }

   @Override
   public String getEntityName() {
        return "HistoricoSerie";
   }

   @Override
   public HistoricoSerie fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
