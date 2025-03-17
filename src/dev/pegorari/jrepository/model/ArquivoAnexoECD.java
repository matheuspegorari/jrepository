package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class ArquivoAnexoECD extends AbstractSankhyaEntity<ArquivoAnexoECD> {
   private String descricao;
   private String nomeArquivoSkw;
   private String caminhoArquivo;
   private String tipoDoc;
   private BigDecimal codEmp;
   private BigDecimal codUsu;
   private Timestamp dtAlter;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        this.descricao = descricao;
   }

   public String getNomeArquivoSkw() {
        return nomeArquivoSkw;
   }

   public void setNomeArquivoSkw(String nomeArquivoSkw) {
        this.nomeArquivoSkw = nomeArquivoSkw;
   }

   public String getCaminhoArquivo() {
        return caminhoArquivo;
   }

   public void setCaminhoArquivo(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
   }

   public String getTipoDoc() {
        return tipoDoc;
   }

   public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
   }

   public BigDecimal getCodEmp() {
        return codEmp;
   }

   public void setCodEmp(BigDecimal codEmp) {
        this.codEmp = codEmp;
   }

   public BigDecimal getCodUsu() {
        return codUsu;
   }

   public void setCodUsu(BigDecimal codUsu) {
        this.codUsu = codUsu;
   }

   public Timestamp getDtAlter() {
        return dtAlter;
   }

   public void setDtAlter(Timestamp dtAlter) {
        this.dtAlter = dtAlter;
   }

   @Override
   public String getTableName() {
        return "TCBAAECD";
   }

   @Override
   public String getEntityName() {
        return "ArquivoAnexoECD";
   }

   @Override
   public ArquivoAnexoECD fromVO(DynamicVO vo) {
        this.descricao = vo.asString("DESCRICAO");
        this.nomeArquivoSkw = vo.asString("NOMEARQUIVOSKW");
        this.caminhoArquivo = vo.asString("CAMINHOARQUIVO");
        this.tipoDoc = vo.asString("TIPODOC");
        this.codEmp = vo.asBigDecimal("CODEMP");
        this.codUsu = vo.asBigDecimal("CODUSU");
        this.dtAlter = vo.asTimestamp("DTALTER");
        return this;
   }
}
