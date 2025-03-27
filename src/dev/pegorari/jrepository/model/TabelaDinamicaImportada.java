package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaDinamicaImportada extends AbstractSankhyaEntity<TabelaDinamicaImportada> {
   public String getTipoLanc() {
        return this.getVo().asString("TIPOLANC");
   }

   public void setTipoLanc(String tipoLanc) {
        markAsChanged("TIPOLANC", tipoLanc);
   }

   public String getDescricao() {
        return this.getVo().asString("DESCRICAO");
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
   }

   public String getTabela() {
        return this.getVo().asString("TABELA");
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
   }

   public String getCodigo() {
        return this.getVo().asString("CODIGO");
   }

   public void setCodigo(String codigo) {
        markAsChanged("CODIGO", codigo);
   }

   public BigDecimal getCodUsu() {
        return this.getVo().asBigDecimal("CODUSU");
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
   }

   public Timestamp getDtAlter() {
        return this.getVo().asTimestamp("DTALTER");
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
   }

   @Override
   public String getTableName() {
        return "TCBDIN";
   }

   @Override
   public String getEntityName() {
        return "TabelaDinamicaImportada";
   }

   @Override
   public TabelaDinamicaImportada fromVO(DynamicVO vo) {
        this.setVo(vo);
        return this;
   }
}
