package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class InformacaoNotaExportacao extends AbstractSankhyaEntity<InformacaoNotaExportacao> {
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
        markAsChanged("DTCONHEC", dtConhec);
        this.dtConhec = dtConhec;
   }

   public String getNroConhec() {
        return nroConhec;
   }

   public void setNroConhec(String nroConhec) {
        markAsChanged("NROCONHEC", nroConhec);
        this.nroConhec = nroConhec;
   }

   public String getNroDeclaracao() {
        return nroDeclaracao;
   }

   public void setNroDeclaracao(String nroDeclaracao) {
        markAsChanged("NRODECLARACAO", nroDeclaracao);
        this.nroDeclaracao = nroDeclaracao;
   }

   public String getNroRe() {
        return nroRe;
   }

   public void setNroRe(String nroRe) {
        markAsChanged("NRORE", nroRe);
        this.nroRe = nroRe;
   }

   public BigDecimal getNuNota() {
        return nuNota;
   }

   public void setNuNota(BigDecimal nuNota) {
        markAsChanged("NUNOTA", nuNota);
        this.nuNota = nuNota;
   }

   public BigDecimal getTipoConhec() {
        return tipoConhec;
   }

   public void setTipoConhec(BigDecimal tipoConhec) {
        markAsChanged("TIPOCONHEC", tipoConhec);
        this.tipoConhec = tipoConhec;
   }

   @Override
   public String getTableName() {
        return "TGFEXPN";
   }

   @Override
   public String getEntityName() {
        return "InformacaoNotaExportacao";
   }

   @Override
   public InformacaoNotaExportacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.dtConhec = vo.asTimestamp("DTCONHEC");
        this.nroConhec = vo.asString("NROCONHEC");
        this.nroDeclaracao = vo.asString("NRODECLARACAO");
        this.nroRe = vo.asString("NRORE");
        this.nuNota = vo.asBigDecimal("NUNOTA");
        this.tipoConhec = vo.asBigDecimal("TIPOCONHEC");
        return this;
   }
}
