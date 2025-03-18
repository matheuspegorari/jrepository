package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class HistoricoSerie extends AbstractSankhyaEntity<HistoricoSerie> {
   private BigDecimal codProd;
   private BigDecimal codUsu;
   private Timestamp dhAlter;
   private BigDecimal nuNota;
   private String ocorrencia;
   private BigDecimal seqHistSerie;
   private BigDecimal seqNota;
   private String serie;
   private String status;

   public BigDecimal getCodProd() {
        return codProd;
   }

   public void setCodProd(BigDecimal codProd) {
        markAsChanged("CODPROD", codProd);
        this.codProd = codProd;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDhAlter() {
        return dhAlter;
   }

   public void setDhAlter(Timestamp dhAlter) {
        markAsChanged("DHALTER", dhAlter);
        this.dhAlter = dhAlter;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public String getOcorrencia() {
        return ocorrencia;
   }

   public void setOcorrencia(String ocorrencia) {
        markAsChanged("OCORRENCIA", ocorrencia);
        this.ocorrencia = ocorrencia;
   }

   public BigDecimal getSeqHistSerie() {
        return seqHistSerie;
   }

   public void setSeqHistSerie(BigDecimal seqHistSerie) {
        markAsChanged("SEQHISTSERIE", seqHistSerie);
        this.seqHistSerie = seqHistSerie;
   }

   public BigDecimal getSeqNota() {
        return seqNota;
   }

   public void setSeqNota(BigDecimal seqNota) {
        markAsChanged("SEQNOTA", seqNota);
        this.seqNota = seqNota;
   }

   public String getSerie() {
        return serie;
   }

   public void setSerie(String serie) {
        markAsChanged("SERIE", serie);
        this.serie = serie;
   }

   public String getStatus() {
        return status;
   }

   public void setStatus(String status) {
        markAsChanged("STATUS", status);
        this.status = status;
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
        this.setOriginalVO(vo);
        this.codProd = vo.asBigDecimal("CODPROD");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dhAlter = vo.asTimestamp("DHALTER");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.ocorrencia = vo.asString("OCORRENCIA");
        this.seqHistSerie = vo.asBigDecimal("SEQHISTSERIE");
        this.seqNota = vo.asBigDecimal("SEQNOTA");
        this.serie = vo.asString("SERIE");
        this.status = vo.asString("STATUS");
        return this;
   }
}
