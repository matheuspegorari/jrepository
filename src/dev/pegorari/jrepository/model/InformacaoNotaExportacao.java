package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.interfaces.SankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoNotaExportacao implements SankhyaEntity<InformacaoNotaExportacao> {

   private Timestamp dtConhec;
   private String nroConhec;
   private String nroDeclaracao;
   private String nroRe;
   private BigDecimal nuNota;
   private BigDecimal tipoConhec;

   public Timestamp getDtConhec() {
        return dtConhec;
   }

   public void setDtConhec(Timestamp dtConhec) {
        this.dtConhec = dtConhec;
   }

   public String getNroConhec() {
        return nroConhec;
   }

   public void setNroConhec(String nroConhec) {
        this.nroConhec = nroConhec;
   }

   public String getNroDeclaracao() {
        return nroDeclaracao;
   }

   public void setNroDeclaracao(String nroDeclaracao) {
        this.nroDeclaracao = nroDeclaracao;
   }

   public String getNroRe() {
        return nroRe;
   }

   public void setNroRe(String nroRe) {
        this.nroRe = nroRe;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        this.nuNota = nuNota;
   }

   public BigDecimal getTipoConhec() {
        return tipoConhec;
   }

   public void setTipoConhec(BigDecimal tipoConhec) {
        this.tipoConhec = tipoConhec;
   }

   @Override
   public String getEntityName() {
        return "InformacaoNotaExportacao";
   }

   @Override
   public InformacaoNotaExportacao fromVO(DynamicVO vo) {
        this.dtConhec = vo.asTimestamp("DTCONHEC");
        this.nroConhec = vo.asString("NROCONHEC");
        this.nroDeclaracao = vo.asString("NRODECLARACAO");
        this.nroRe = vo.asString("NRORE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.tipoConhec = vo.asBigDecimal("TIPOCONHEC");
        return this;
   }
}
