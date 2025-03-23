package dev.pegorari.jrepository.model;

import br.com.sankhya.jape.vo.DynamicVO;
import dev.pegorari.jrepository.abstractions.AbstractSankhyaEntity;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class CodigoItemIPM extends AbstractSankhyaEntity<CodigoItemIPM> {
   private String descricao;
   private BigDecimal codUf;
   private String codigoItem;
   private Timestamp dtInicial;
   private Timestamp dtFinal;

   public String getDescricao() {
        return descricao;
   }

   public void setDescricao(String descricao) {
        markAsChanged("DESCRICAO", descricao);
        this.descricao = descricao;
   }

   public BigDecimal getCodUf() {
        return codUf;
   }

   public void setCodUf(BigDecimal codUf) {
        markAsChanged("CODUF", codUf);
        this.codUf = codUf;
   }

   public String getCodigoItem() {
        return codigoItem;
   }

   public void setCodigoItem(String codigoItem) {
        markAsChanged("CODIGOITEM", codigoItem);
        this.codigoItem = codigoItem;
   }

   public Timestamp getDtInicial() {
        return dtInicial;
   }

   public void setDtInicial(Timestamp dtInicial) {
        markAsChanged("DTINICIAL", dtInicial);
        this.dtInicial = dtInicial;
   }

   public Timestamp getDtFinal() {
        return dtFinal;
   }

   public void setDtFinal(Timestamp dtFinal) {
        markAsChanged("DTFINAL", dtFinal);
        this.dtFinal = dtFinal;
   }

   @Override
   public String getTableName() {
        return "TGFCIPM";
   }

   @Override
   public String getEntityName() {
        return "CodigoItemIPM";
   }

   @Override
   public CodigoItemIPM fromVO(DynamicVO vo) {
        this.setVo(vo);
        this.descricao = vo.asString("DESCRICAO");
        this.codUf = vo.asBigDecimal("CODUF");
        this.codigoItem = vo.asString("CODIGOITEM");
        this.dtInicial = vo.asTimestamp("DTINICIAL");
        this.dtFinal = vo.asTimestamp("DTFINAL");
        return this;
   }
}
