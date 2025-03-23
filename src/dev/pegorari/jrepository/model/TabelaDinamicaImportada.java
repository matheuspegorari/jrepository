package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class TabelaDinamicaImportada extends AbstractSankhyaEntity<TabelaDinamicaImportada> {
   private String tipoLanc;
   private String descricao;
   private String tabela;
   private String codigo;
   private BigDecimal codUsu;
   private Timestamp dtAlter;

   public String getTipoLanc() {
        return tipoLanc;
   }

   public void setTipoLanc(String tipoLanc) {
        markAsChanged("TIPOLANC", tipoLanc);
        this.tipoLanc = tipoLanc;
   }

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public String getTabela() {
        return tabela;
   }

   public void setTabela(String tabela) {
        markAsChanged("TABELA", tabela);
        this.tabela = tabela;
   }

   public String getCodigo() {
        return codigo;
   }

   public void setCodigo(String codigo) {
        markAsChanged("CODIGO", codigo);
        this.codigo = codigo;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        markAsChanged("CODUSU", codUsu);
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        markAsChanged("DTALTER", dtAlter);
        this.dtAlter = dtAlter;
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
        this.tipoLanc = vo.asString("TIPOLANC");
        this.descricao = vo.asString("DESCRICAO");
        this.tabela = vo.asString("TABELA");
        this.codigo = vo.asString("CODIGO");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        return this;
   }
}
