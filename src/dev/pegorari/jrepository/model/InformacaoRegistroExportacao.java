package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;

public class InformacaoRegistroExportacao extends AbstractSankhyaEntity<InformacaoRegistroExportacao> {
   private Timestamp dtRe;
   private String nroDeclaracao;
   private String nroRe;

   public Timestamp getDtRe() {
        return dtRe;
   }

   public void setDtRe(Timestamp dtRe) {
        markAsChanged("DTRE", dtRe);
        this.dtRe = dtRe;
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

   @Override
   public String getTableName() {
        return "TGFEXPR";
   }

   @Override
   public String getEntityName() {
        return "InformacaoRegistroExportacao";
   }

   @Override
   public InformacaoRegistroExportacao fromVO(DynamicVO vo) {
        this.setOriginalVO(vo);
        this.dtRe = vo.asTimestamp("DTRE");
        this.nroDeclaracao = vo.asString("NRODECLARACAO");
        this.nroRe = vo.asString("NRORE");
        return this;
   }
}
